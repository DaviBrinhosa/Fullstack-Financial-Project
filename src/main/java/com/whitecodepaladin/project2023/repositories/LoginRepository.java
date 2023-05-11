package com.whitecodepaladin.project2023.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.whitecodepaladin.project2023.entities.Login;

public interface LoginRepository extends JpaRepository<Login, Long> {

}
