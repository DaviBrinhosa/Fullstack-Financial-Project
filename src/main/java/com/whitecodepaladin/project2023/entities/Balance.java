package com.whitecodepaladin.project2023.entities;

import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "main_balance")
public class Balance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "balance_id", nullable=false)
	private Long balanceID;
	
	@Column(name = "user_id", nullable=false)
	private Long userID;
	
	@Column(name = "description", nullable=false, length = 200)
	private String description;
	
	@Column(name = "bank_account", nullable=false, length = 200)
	private String bank_account;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "transition_date", nullable=false)
	private Date transitionDate;
	
	@Column(name = "transition_value", nullable=false)
	private Double transitionValue;
	
	@Column(name = "observation", length = 500)
	private String observation;

	public Balance() {
	}

	public Balance(Long balanceID, Long userID, String description, String bank_account, Date transitionDate,
			Double transitionValue, String observation) {
		this.balanceID = balanceID;
		this.userID = userID;
		this.description = description;
		this.bank_account = bank_account;
		this.transitionDate = transitionDate;
		this.transitionValue = transitionValue;
		this.observation = observation;
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

	@Override
	public int hashCode() {
		return Objects.hash(balanceID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Balance other = (Balance) obj;
		return Objects.equals(balanceID, other.balanceID);
	}

}
