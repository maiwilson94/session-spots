package com.sessionspots.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sessionspots.model.User;
import com.sessionspots.model.UserAuthority;
import com.sessionspots.service.UserAuthorityService;
import com.sessionspots.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserAuthorityService userAuthorityService;
	
	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String getRegisterUser(@ModelAttribute ("user") User user) {
		
		return "registration";
	}
	
	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public String addRegisterUser(@Valid @ModelAttribute ("user") User user, HttpSession session, BindingResult result) {
			
		if (result.hasErrors()) {
			return "registration";
		}
		else {
			userService.save(user);
			
			UserAuthority userAuthority = new UserAuthority();
			userAuthority.setUser(user);
			userAuthorityService.save(userAuthority);
		}
		
		return "redirect:login.html";
	}
}
