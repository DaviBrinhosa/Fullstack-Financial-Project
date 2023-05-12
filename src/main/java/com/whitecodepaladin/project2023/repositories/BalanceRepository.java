package com.whitecodepaladin.project2023.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.whitecodepaladin.project2023.entities.Balance;

public interface BalanceRepository extends JpaRepository<Balance, Long> {
	
}
