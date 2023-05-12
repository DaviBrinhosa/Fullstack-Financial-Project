package com.whitecodepaladin.project2023.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_balance")
public class UserBalance {

	@EmbeddedId
	private UserBalancePK id = new UserBalancePK();

	private Integer position;

	public UserBalance() {
		
	}

	public UserBalance(Login userID, Balance userlist, Integer position) {
		id.setUserID(userID);
		id.setUserlist(userlist);
		this.position = position;
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