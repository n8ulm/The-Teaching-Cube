package com.teaching_cube.crud;

import org.springframework.data.repository.CrudRepository;

import com.teaching_cube.model.TeachingCubeLesson;

public interface TeachingCubeLessonRepo extends CrudRepository<TeachingCubeLesson, Integer> {

}
