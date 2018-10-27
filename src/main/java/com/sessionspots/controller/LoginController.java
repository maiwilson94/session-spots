package com.sessionspots.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.sessionspots.model.UserInfo;
import com.sessionspots.service.UserService;

@Controller
@SessionAttributes("user")
public class LoginController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(ModelMap model) {
		
		return "login";
	}
	
	@RequestMapping(value = {"/", "/index.html"}, method = RequestMethod.GET)
	public String loginSubmitted(ModelMap model) {
		
		String email = ((UserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUsername();
		UserInfo user = userService.getUserInfo(email);
		model.addAttribute("user", user);
		
		return "home";
	}
	
	@RequestMapping(value = "/loginFailed", method = RequestMethod.GET)
	public String loginFailed(ModelMap model) {
		
		model.addAttribute("error", "true");
		return "login";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET) 
	public String logout(ModelMap model) {
		
		return "login";
	}
}
