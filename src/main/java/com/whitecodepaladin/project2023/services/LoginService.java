package com.whitecodepaladin.project2023.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whitecodepaladin.project2023.dto.LoginDTO;
import com.whitecodepaladin.project2023.entities.Login;
import com.whitecodepaladin.project2023.repositories.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	private LoginRepository loginRepository;
	
	public List<LoginDTO> findAll() {
		List<Login> result = loginRepository.findAll();
		List<LoginDTO> dto = result.stream().map(x -> new LoginDTO(x)).toList();
		return dto;
	}
}
