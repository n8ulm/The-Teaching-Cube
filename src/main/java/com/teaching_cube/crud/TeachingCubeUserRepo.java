package com.teaching_cube.crud;

import org.springframework.data.repository.CrudRepository;

import com.teaching_cube.model.TeachingCubeUser;

public interface TeachingCubeUserRepo extends CrudRepository<TeachingCubeUser, Integer> {
	
}