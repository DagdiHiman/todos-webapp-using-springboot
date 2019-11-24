package com.project1.himan.ProjectOne.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.project1.himan.ProjectOne.service.LoginService;


@Controller
@SessionAttributes("name")
public class LoginController {
	//LOGIN PAGE | localhost:8080/login
	@Autowired
	LoginService service;
	
	@RequestMapping(value="/login", method= RequestMethod.GET )
	public String showLoginMessage(ModelMap model) {
		//System.out.println("name is:"+name);
		//model.put("name", name);
		return "login";
	}
	
	@RequestMapping(value="/login", method= RequestMethod.POST )
	public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String pswd) {

		boolean isValid = service.validateUser(name, pswd);
		if(!isValid) {
			model.addAttribute("str2","Try Again!");
			return "login";
		}
		model.put("name", name);
		model.put("password",pswd);
		model.addAttribute("str","rakesh dagdi");
		return "welcome";
	}
}
