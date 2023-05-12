package com.whitecodepaladin.project2023.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class UserBalancePK {

	@ManyToOne
    @JoinColumn(name = "login_id")
    private Login userID;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Balance userlist;

    public UserBalancePK() {
    	
    }

	public UserBalancePK(Login userID, Balance user_id_list) {
		this.userID = userID;
		this.userlist = userlist;
	}

	public Login getUserID() {
		return userID;
	}

	public void setUserID(Login userID) {
		this.userID = userID;
	}

	public Balance getUserlist() {
		return userlist;
	}

	public void setUserlist(Balance userlist) {
		this.userlist = userlist;
	}

	@Override
	public int hashCode() {
		return Objects.hash(userID, userlist);
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
		return Objects.equals(userID, other.userID) && Objects.equals(userlist, other.userlist);
	}
    
}