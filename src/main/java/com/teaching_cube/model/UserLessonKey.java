package com.teaching_cube.model;

import java.io.Serializable;

public class UserLessonKey implements Serializable {
	
	private String userName;
	private Integer lessonID;
	
	public UserLessonKey() {};
	public UserLessonKey(String userName, Integer lessonId) {
		this.userName = userName;
		this.lessonID = lessonId;
	}
}
