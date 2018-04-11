package com.teaching_cube.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TeachingCubeUserLesson {
	@Id
	private String userName;
	@Id
	private int lessonID;
	private int lessonScore;
	
	protected TeachingCubeUserLesson() {}
	
	public TeachingCubeUserLesson(String userName, int lessonID, int lessonScore) {
		this.userName = userName;
		this.lessonID = lessonID;
		this.lessonScore = lessonScore;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getLessonID() {
		return lessonID;
	}

	public void setLessonID(int lessonID) {
		this.lessonID = lessonID;
	}

	public int getLessonScore() {
		return lessonScore;
	}

	public void setLessonScore(int lessonScore) {
		this.lessonScore = lessonScore;
	}
	
	
	

}
