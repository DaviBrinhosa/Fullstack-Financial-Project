package com.whitecodepaladin.project2023.services;

import java.util.List;

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
	public List<BalanceDTO> findAll() {
		List<Balance> result = balanceRepository.findAll();
		return result.stream().map(x -> new BalanceDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public BalanceDTO findById(Long id) {
		Balance result = balanceRepository.findById(id).get();
		return new BalanceDTO(result);
	}
}