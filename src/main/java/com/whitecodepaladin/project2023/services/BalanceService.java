package com.whitecodepaladin.project2023.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.whitecodepaladin.project2023.dto.BalanceDTO;
import com.whitecodepaladin.project2023.entities.Balance;
import com.whitecodepaladin.project2023.repositories.BalanceRepository;

@Service
public class BalanceService {
	
	@Autowired
	private BalanceRepository balanceRepository;
	
	@Transactional(readOnly = true)
	public BalanceDTO findById(Long id) {
		Balance result = balanceRepository.findById(id).get();
		BalanceDTO dto = new BalanceDTO(result);
		return dto;
	}
}