package com.project1.himan.ProjectOne.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("h")&&password.equalsIgnoreCase("h");
	}
}
