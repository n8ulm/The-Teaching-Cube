package com.teaching_cube.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TeachingCubeUser {
	
	@Id 
	private String userName;
	private LocalDate dateOfBirth;
	private String eMail;
	private String userPassword;
	
	protected TeachingCubeUser() {}

    public TeachingCubeUser(String userName, LocalDate dateOfBirth, String eMail, String userPassword) {
        this.userName = userName;
        this.dateOfBirth = dateOfBirth;
        this.eMail = eMail;
        this.userPassword = userPassword;
    }

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

}
