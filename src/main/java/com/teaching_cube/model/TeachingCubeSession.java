package com.teaching_cube.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class TeachingCubeSession {
	@Id 
	@SequenceGenerator(name="my_seq2", sequenceName="teaching_cube_session_sessionID_seq")
	@GeneratedValue (strategy = GenerationType.SEQUENCE, generator="my_seq2")
	private Integer sessionID;
	private LocalDate loginDate;
	private LocalDate logoutDate;
	private String userName;

	protected TeachingCubeSession() {}
	
	public TeachingCubeSession(LocalDate loginDate, LocalDate logoutDate, String userName) {
		this.loginDate = loginDate;
		this.logoutDate = logoutDate;
		this.userName = userName;
	}

	public Integer getSessionID() {
		return sessionID;
	}

	public void setSessionID(Integer sessionID) {
		this.sessionID = sessionID;
	}

	public LocalDate getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(LocalDate loginDate) {
		this.loginDate = loginDate;
	}

	public LocalDate getLogoutDate() {
		return logoutDate;
	}

	public void setLogoutDate(LocalDate logoutDate) {
		this.logoutDate = logoutDate;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
