package com.teaching_cube.crud;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.teaching_cube.model.TeachingCubeUser;

public interface TeachingCubeUserRepo extends CrudRepository<TeachingCubeUser, Integer> {
	
	public Optional<TeachingCubeUser> findByUserName(String userName);
	
	@Transactional
	public void deleteByUserName(String userName);
	
}