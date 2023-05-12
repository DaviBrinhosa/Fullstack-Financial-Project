package com.whitecodepaladin.project2023.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.whitecodepaladin.project2023.dto.LoginDTO;
import com.whitecodepaladin.project2023.dto.UserBalanceDTO;
import com.whitecodepaladin.project2023.entities.Login;
import com.whitecodepaladin.project2023.projections.UserBalanceProjection;
import com.whitecodepaladin.project2023.repositories.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	private LoginRepository loginRepository;
	
	@Transactional(readOnly = true)
	public List<LoginDTO> findAll() {
		List<Login> result = loginRepository.findAll();
		return result.stream().map(x -> new LoginDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public LoginDTO findById(Long id) {
		Login result = loginRepository.findById(id).get();
		return new LoginDTO(result);
	}
	
	@Transactional(readOnly = true)
	public List<UserBalanceDTO> findByList(Long listId) {
		List<UserBalanceProjection> result = loginRepository.searchByList(listId);
		return result.stream().map(x -> new UserBalanceDTO(x)).toList();
	}
}
