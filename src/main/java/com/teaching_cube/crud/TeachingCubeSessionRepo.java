package com.teaching_cube.crud;

import org.springframework.data.repository.CrudRepository;

import com.teaching_cube.model.TeachingCubeSession;

public interface TeachingCubeSessionRepo extends CrudRepository<TeachingCubeSession, Integer>{

}