package com.teaching_cube.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class TeachingCubeLesson {

	@Id 
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int lessonID;
	private String lessonDetails;
	private int sessionID;
	private int lessonScore;
	
	protected TeachingCubeLesson() {}
	
	public TeachingCubeLesson(String lessonDetails, int sessionID, int lessonScore){
		this.lessonDetails = lessonDetails;
		this.sessionID = sessionID;
		this.lessonScore = lessonScore;
	}
	
	
    @Override
    public String toString() {
        //TODO write toString 
    	return "";
    }
	
	public int getLessonID() {
		return lessonID;
	}
	public void setLessonID(int lessonID) {
		this.lessonID = lessonID;
	}
	public String getLessonDetails() {
		return lessonDetails;
	}
	public void setLessonDetails(String lessonDetails) {
		this.lessonDetails = lessonDetails;
	}
	public int getSessionID() {
		return sessionID;
	}
	public void setSessionID(int sessionID) {
		this.sessionID = sessionID;
	}
	public int getScoreID() {
		return lessonScore;
	}
	public void setScoreID(int scoreID) {
		this.lessonScore = scoreID;
	}
	
	
	
}
