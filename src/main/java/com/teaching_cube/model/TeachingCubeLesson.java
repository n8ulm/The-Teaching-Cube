package com.teaching_cube.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

// Lesson pojo
@Entity
public class TeachingCubeLesson {

	@Id 
	private int lessonID;
	private String lessonTitle;
	private String lessonQuestion;
	private String lessonAnswer;
	
	protected TeachingCubeLesson() {}
	
	public TeachingCubeLesson(String lessonQuestion, String lessonTitle){
		this.lessonTitle = lessonTitle;
		this.lessonQuestion = lessonQuestion;
		this.lessonAnswer = lessonAnswer;

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
	public String getLessonQuestion() {
		return lessonQuestion;
	}
	public void setLessonQuestion(String lessonQuestion) {
		this.lessonQuestion = lessonQuestion;
	}

	public String getLessonAnswer() {
		return lessonAnswer;
	}
	public void setLessonAnswer(String lessonAnswer) {
		this.lessonAnswer = lessonAnswer;
	}
	
	
}
