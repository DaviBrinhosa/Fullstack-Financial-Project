package com.whitecodepaladin.project2023.dto;

import java.util.Date;

import org.springframework.beans.BeanUtils;

import com.whitecodepaladin.project2023.entities.Balance;

public class BalanceDTO {

	private Long balanceID;
	private Long userID;
	private String description;
	private String bank_account;
	private Date transitionDate;
	private Double transitionValue;
	private String observation;

	public BalanceDTO() {
	}

	public BalanceDTO(Balance entity) {
		BeanUtils.copyProperties(entity, this);
	}

	public Long getBalanceID() {
		return balanceID;
	}

	public void setBalanceID(Long balanceID) {
		this.balanceID = balanceID;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBank_account() {
		return bank_account;
	}

	public void setBank_account(String bank_account) {
		this.bank_account = bank_account;
	}

	public Date getTransitionDate() {
		return transitionDate;
	}

	public void setTransitionDate(Date transitionDate) {
		this.transitionDate = transitionDate;
	}

	public Double getTransitionValue() {
		return transitionValue;
	}

	public void setTransitionValue(Double transitionValue) {
		this.transitionValue = transitionValue;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}


}
