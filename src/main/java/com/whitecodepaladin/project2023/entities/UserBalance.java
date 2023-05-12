package com.whitecodepaladin.project2023.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_balance")
public class UserBalance {

	@EmbeddedId
	private UserBalancePK id = new UserBalancePK();

	@Column(name = "user_id", nullable=false)
	private Long userID;

	public UserBalance() {
		
	}

	public UserBalance(Login loginID, Balance balanceID, Long userID) {
		id.setLoginID(loginID);
		id.setBalanceID(balanceID);
		this.userID = userID;
	}
	

	public UserBalancePK getId() {
		return id;
	}

	public void setId(UserBalancePK id) {
		this.id = id;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserBalance other = (UserBalance) obj;
		return Objects.equals(id, other.id);
	}
	
}