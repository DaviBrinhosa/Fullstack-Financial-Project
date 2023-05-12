package com.whitecodepaladin.project2023.dto;

import java.util.Date;

import com.whitecodepaladin.project2023.entities.Login;
import com.whitecodepaladin.project2023.projections.UserBalanceProjection;

public class UserBalanceDTO {
	
	private Long id;
	private String user;
	private String bank;
	private String description;
	private Date date;
	private Double value;
	private String observation;
	
	public UserBalanceDTO() {
	}	
	
	public UserBalanceDTO(Login entity) {
		id = entity.getIdLogin();
	}
	
	public UserBalanceDTO(UserBalanceProjection projection) {
		id = projection.getID();
		user = projection.getUser();
		bank = projection.getBank();
		description = projection.getDescription();
		date = projection.getDate();
		value = projection.getValue();
		observation = projection.getObservation();
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}
	
}
