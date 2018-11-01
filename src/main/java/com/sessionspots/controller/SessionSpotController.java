package com.sessionspots.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sessionspots.model.SessionSpot;
import com.sessionspots.model.SessionSpotInfo;
import com.sessionspots.model.User;
import com.sessionspots.model.UserInfo;
import com.sessionspots.service.SessionSpotService;
import com.sessionspots.service.UserService;

@Controller
public class SessionSpotController {
	
	@Autowired
	private SessionSpotService sessionSpotService;
	
	@Autowired
	private UserService userService;
	
	private String LocationIQToken = "8c51d31abed9b7";
	
	@RequestMapping(value = {"/", "index.html"}, method = RequestMethod.POST) 
	public String addSessionSpot(@Valid @ModelAttribute ("sessionspot") SessionSpot sessionSpot, ModelMap model, HttpSession session, BindingResult result) {
		
		if (result.hasErrors()) {
			return "addSessionSpot";
		}
		else {
			// Get latitude and longitude of address via LocationIQ API
			String url = "https://us1.locationiq.com/v1/search.php?key=" + 
							LocationIQToken + "&q=" + sessionSpot.getAddress() + "&format=json";
			
			try {
				URL obj = new URL(url);
				HttpURLConnection con = (HttpURLConnection) obj.openConnection();
				con.setRequestMethod("GET");
				con.setRequestProperty("User-Agent", "Mozilla/5.0");
				BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
				
				String inputLine;
				StringBuffer response = new StringBuffer();
				while ((inputLine = in.readLine()) != null) {
					response.append(inputLine);
				}
				in.close();
				
				// LocationIQ returns json array
				JSONArray jsonArr = new JSONArray(response.toString());
				JSONObject jsonObj = jsonArr.getJSONObject(0);
				sessionSpot.setLatitude(Double.parseDouble(jsonObj.getString("lat")));
				sessionSpot.setLongitude(Double.parseDouble(jsonObj.getString("lon")));
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
			
			UserInfo userInfo = (UserInfo) session.getAttribute("user");
			User user = userService.getUser(userInfo.getEmail());	
			sessionSpot.setUser(user);
			
			sessionSpotService.save(sessionSpot);
		}
		
		model.addAttribute("sessionspot", new SessionSpot());
		
		return "home";
	}
	
	@RequestMapping(value = "/sessionSpots", method = RequestMethod.GET)
	public List<SessionSpotInfo> getAllSessionSpots() {
		
		return sessionSpotService.getAllSessionSpots();
	}
}
