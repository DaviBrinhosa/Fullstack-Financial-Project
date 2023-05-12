package com.whitecodepaladin.project2023.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class UserBalancePK {

	@ManyToOne
    @JoinColumn(name = "login_id")
    private Login loginID;

    @ManyToOne
    @JoinColumn(name = "balance_id")
    private Balance balanceID;

    public UserBalancePK() {
    	
    }

	public UserBalancePK(Login loginID, Balance balanceID) {
		super();
		this.loginID = loginID;
		this.balanceID = balanceID;
	}

	public Login getLoginID() {
		return loginID;
	}

	public void setLoginID(Login loginID) {
		this.loginID = loginID;
	}

	public Balance getBalanceID() {
		return balanceID;
	}

	public void setBalanceID(Balance balanceID) {
		this.balanceID = balanceID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(balanceID, loginID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserBalancePK other = (UserBalancePK) obj;
		return Objects.equals(balanceID, other.balanceID) && Objects.equals(loginID, other.loginID);
	}
    
}