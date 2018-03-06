package com.teaching_cube.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TeachingCubeUser {
	
	@Id 
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Integer userID;
	private String userName;
	private String dateOfBirth;
	private String eMail;
	private String userPassword;
	
	protected TeachingCubeUser() {}

    public TeachingCubeUser(String userName, String dateOfBirth, String eMail, String userPassword) {
        this.userName = userName;
        this.dateOfBirth = dateOfBirth;
        this.eMail = eMail;
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        //TODO write toString 
    	return "";
    }

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
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
