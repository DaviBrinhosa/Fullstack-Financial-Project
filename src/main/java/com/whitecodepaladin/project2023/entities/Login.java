package com.whitecodepaladin.project2023.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "main_login")
public class Login {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_login")
	private Long idLogin;
	
	@Column(name = "username")
	private String usernameLogin;
	
	@Column(name = "password")
	private String passwordLogin;
	
	@Column(name = "email")
	private String emailLogin;
	
	@Column(name = "genre")
	private String genreLogin;
	
	@Column(name = "birthdate")
	private Integer birthdateLogin;
	
	public Login(String usernameLogin, String passwordLogin, String emailLogin, String genreLogin,
			Integer birthdataLogin) {
		this.usernameLogin = usernameLogin;
		this.passwordLogin = passwordLogin;
		this.emailLogin = emailLogin;
		this.genreLogin = genreLogin;
		this.birthdateLogin = birthdataLogin;
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

	public Integer getBirthdateLogin() {
		return birthdateLogin;
	}

	public void setBirthdateLogin(Integer birthdateLogin) {
		this.birthdateLogin = birthdateLogin;
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
