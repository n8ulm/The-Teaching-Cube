package com.teaching_cube.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.teaching_cube.crud.TeachingCubeUserRepo;
import com.teaching_cube.model.TeachingCubeLesson;
import com.teaching_cube.model.TeachingCubeUser;

@Controller
@RequestMapping("/teaching-cube")
@ComponentScan("com.teaching_cube.DAO.impl")
public class TeachingCubeController {
	
	//
	@Autowired
	TeachingCubeUserRepo dao;
	
	/* Endpoints:
	 * Get Lesson Plan
	 * 
	 */
	
	//Get User from DB
	//This maps request in URL after /user 
	@RequestMapping(path = "/user", method = RequestMethod.GET)
	public ResponseEntity<TeachingCubeUser> getUser(@RequestParam Integer userID){
		
		ResponseEntity<TeachingCubeUser> response = new ResponseEntity<TeachingCubeUser>(dao.findOne(userID), HttpStatus.OK);
		
		return response;
		
	}
	
	@RequestMapping(path = "/user", method = RequestMethod.POST)
	public ResponseEntity<String> postUser(@RequestBody TeachingCubeUser request) {
		
		// TODO: replace with save to database
		dao.save(request);
		
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}
	
	@RequestMapping(path = "/user", method = RequestMethod.PUT)
	public ResponseEntity<String> putUser(@RequestBody TeachingCubeUser request){
		
		// TODO: replace with save to database
		dao.save(request);
		
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
	@RequestMapping(path = "/user", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteUser(@RequestParam Integer userID){
		
		// TODO: after db is created, use DELETE function
		dao.delete(userID);
		
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	

//	@RequestMapping(path = "/lessonPlan", method = RequestMethod.GET)
//	public ResponseEntity<TeachingCubeUser> getLessonPlan(@RequestParam int lessonID){
//		
//		ResponseEntity<TeachingCubeLesson> response = new ResponseEntity<TeachingCubeLesson>(dao.retrieve(lessonID), HttpStatus.OK);
//		
//		return response;
//		
//	}
	
}
