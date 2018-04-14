package com.teaching_cube.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(UserLessonKey.class)
public class TeachingCubeUserLesson {
	@Id
	private String userName;
	@Id
	private Integer lessonID;
	private int lessonScore;

	protected TeachingCubeUserLesson() {
	}

	public TeachingCubeUserLesson(String userName, Integer lessonID, int lessonScore) {
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

	public Integer getLessonID() {
		return lessonID;
	}

	public void setLessonID(Integer lessonID) {
		this.lessonID = lessonID;
	}

	public int getLessonScore() {
		return lessonScore;
	}

	public void setLessonScore(int lessonScore) {
		this.lessonScore = lessonScore;
	}

}
