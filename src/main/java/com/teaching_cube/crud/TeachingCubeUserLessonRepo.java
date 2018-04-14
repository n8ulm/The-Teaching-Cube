package com.teaching_cube.crud;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.teaching_cube.model.TeachingCubeUserLesson;

public interface TeachingCubeUserLessonRepo extends CrudRepository <TeachingCubeUserLesson, String>{
	
	public Optional<TeachingCubeUserLesson> findByUserNameAndLessonID(String userName, Integer lessonID);

}
