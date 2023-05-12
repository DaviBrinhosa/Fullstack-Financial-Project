package com.whitecodepaladin.project2023.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.whitecodepaladin.project2023.dto.LoginDTO;
import com.whitecodepaladin.project2023.services.LoginService;

@RestController
@RequestMapping(value = "/login")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@GetMapping
	public List<LoginDTO> findAll() {
		List<LoginDTO> result = loginService.findAll();
		return result;
	}
}
