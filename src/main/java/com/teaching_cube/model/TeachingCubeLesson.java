package com.teaching_cube.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


@Entity
public class TeachingCubeLesson {

	@Id 
	private int lessonID;
	private String lessonTitle;
	private String lessonDetails;
	
	protected TeachingCubeLesson() {}
	
	public TeachingCubeLesson(String lessonDetails, String lessonTitle){
		this.lessonTitle = lessonTitle;
		this.lessonDetails = lessonDetails;

	}
	
	public int getLessonID() {
		return lessonID;
	}
	public void setLessonID(int lessonID) {
		this.lessonID = lessonID;
	}
	public String getLessonTitle() {
		return lessonTitle;
	}
	public void setLessonTitle(String lessonTitle) {
		this.lessonTitle = lessonTitle;
	}
	public String getLessonDetails() {
		return lessonDetails;
	}
	public void setLessonDetails(String lessonDetails) {
		this.lessonDetails = lessonDetails;
	}

	
	
	
}
