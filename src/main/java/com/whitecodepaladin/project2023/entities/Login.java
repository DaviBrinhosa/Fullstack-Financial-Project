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
@Table(name = "main_login")
public class Login {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "login_id", nullable=false)
	private Long idLogin;
	
	@Column(name = "username", nullable=false)
	private String usernameLogin;
	
	@Column(name = "fullname", nullable=false)
	private String fullnameLogin;
	
	@Column(name = "password", nullable=false)
	private String passwordLogin;
	
	@Column(name = "email", nullable=false)
	private String emailLogin;
	
	@Column(name = "genre")
	private String genreLogin;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "birthdate")
	private Date birthdateLogin;
	
	@Column(name = "user_privilege", nullable=false)
	private String userPrivilegeLogin;
	
	@Column(name = "status", nullable=false)
	private String statusLogin;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "inactive_date")
	private Date inactivedateLogin;
	
	public Login() {
	}

	public Login(Long idLogin, String usernameLogin, String fullnameLogin, String passwordLogin, String emailLogin,
			String genreLogin, Date birthdateLogin, String userPrivilegeLogin, String statusLogin,
			Date inactivedateLogin) {
		this.idLogin = idLogin;
		this.usernameLogin = usernameLogin;
		this.fullnameLogin = fullnameLogin;
		this.passwordLogin = passwordLogin;
		this.emailLogin = emailLogin;
		this.genreLogin = genreLogin;
		this.birthdateLogin = birthdateLogin;
		this.userPrivilegeLogin = userPrivilegeLogin;
		this.statusLogin = statusLogin;
		this.inactivedateLogin = inactivedateLogin;
	}



	public Long getIdLogin() {
		return idLogin;
	}

	public void setIdLogin(Long idLogin) {
		this.idLogin = idLogin;
	}
	
	public String getUsernameLogin() {
		return usernameLogin;
	}

	public void setUsernameLogin(String usernameLogin) {
		this.usernameLogin = usernameLogin;
	}

	public String getFullnameLogin() {
		return fullnameLogin;
	}

	public void setFullnameLogin(String fullnameLogin) {
		this.fullnameLogin = fullnameLogin;
	}

	public String getPasswordLogin() {
		return passwordLogin;
	}

	public void setPasswordLogin(String passwordLogin) {
		this.passwordLogin = passwordLogin;
	}

	public String getEmailLogin() {
		return emailLogin;
	}

	public void setEmailLogin(String emailLogin) {
		this.emailLogin = emailLogin;
	}

	public String getGenreLogin() {
		return genreLogin;
	}

	public void setGenreLogin(String genreLogin) {
		this.genreLogin = genreLogin;
	}

	public Date getBirthdateLogin() {
		return birthdateLogin;
	}

	public void setBirthdateLogin(Date birthdateLogin) {
		this.birthdateLogin = birthdateLogin;
	}
	
	public String getStatusLogin() {
		return statusLogin;
	}

	public void setStatusLogin(String statusLogin) {
		this.statusLogin = statusLogin;
	}

	public Date getInactivedateLogin() {
		return inactivedateLogin;
	}

	public void setInactivedateLogin(Date inactivedateLogin) {
		this.inactivedateLogin = inactivedateLogin;
	}

	public String getUserPrivilegeLogin() {
		return userPrivilegeLogin;
	}

	public void setUserPrivilegeLogin(String userPrivilegeLogin) {
		this.userPrivilegeLogin = userPrivilegeLogin;
	}

	@Override
	public int hashCode() {
		return Objects.hash(emailLogin, idLogin);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Login other = (Login) obj;
		return Objects.equals(emailLogin, other.emailLogin) && Objects.equals(idLogin, other.idLogin);
	}
	
}
