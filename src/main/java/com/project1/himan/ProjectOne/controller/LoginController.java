package com.project1.himan.ProjectOne.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	//LOGIN PAGE | localhost:8080/login
	
	@RequestMapping(value="/login", method= RequestMethod.GET )
	public String showLoginMessage(ModelMap model) {
		
		//System.out.println("name is:"+name);
		//model.put("name", name);
		return "login";
	}
	
	//123
//	@RequestMapping(value="/login", method= RequestMethod.POST )
//	public String showWelcomePage(ModelMap model, @RequestParam String name) {
//		model.put("name", name);
//		return "welcome";
//	}
}
