package com.whitecodepaladin.project2023.dto;

import java.util.Date;

import com.whitecodepaladin.project2023.entities.Login;

public class LoginDTO {
	
	private String usernameLogin;
	private String passwordLogin;
	private String emailLogin;
	
	public LoginDTO() {
	}	
	
	public LoginDTO(Login entity) {
		usernameLogin = entity.getUsernameLogin();
		passwordLogin = entity.getPasswordLogin();
		emailLogin = entity.getEmailLogin();
	}

	public String getUsernameLogin() {
		return usernameLogin;
	}

	public String getPasswordLogin() {
		return passwordLogin;
	}

	public String getEmailLogin() {
		return emailLogin;
	}
	
	
}
