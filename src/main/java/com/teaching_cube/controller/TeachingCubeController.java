package com.teaching_cube.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.teaching_cube.crud.TeachingCubeLessonRepo;
import com.teaching_cube.crud.TeachingCubeUserRepo;
import com.teaching_cube.model.TeachingCubeUser;
import com.teaching_cube.model.TeachingCubeLesson;

@Controller
@RequestMapping("/teaching-cube")
public class TeachingCubeController {
	
	//
	@Autowired
	TeachingCubeUserRepo dao_user;
	@Autowired
	TeachingCubeLessonRepo dao_lesson;
	
	//Get User from DB
	//This maps request in URL after /user 
	@RequestMapping(path = "/user", method = RequestMethod.GET)
	public ResponseEntity<TeachingCubeUser> getUser(@RequestParam Integer userID){
		
		ResponseEntity<TeachingCubeUser> response = new ResponseEntity<TeachingCubeUser>(dao_user.findOne(userID), HttpStatus.OK);
		
		return response;
		
	}

	//Get Lesson from DB
	@RequestMapping(path = "/lesson", method = RequestMethod.GET)
	public ResponseEntity<TeachingCubeLesson> getLesson(@RequestParam Integer lessonID){
		
		ResponseEntity<TeachingCubeLesson> response = new ResponseEntity<TeachingCubeLesson>(dao_lesson.findOne(lessonID), HttpStatus.OK);
		
		return response;
	}
	
	
	@RequestMapping(path = "/user", method = RequestMethod.POST)
	public ResponseEntity<String> postUser(@RequestBody TeachingCubeUser request) {
		
		// TODO: replace with save to database
		dao_user.save(request);
		
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}
	
	@RequestMapping(path = "/lesson", method = RequestMethod.POST)
	public ResponseEntity<String> postLesson(@RequestBody TeachingCubeLesson request) {
		
		// TODO: replace with save to database
		dao_lesson.save(request);
		
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}
	
	@RequestMapping(path = "/user", method = RequestMethod.PUT)
	public ResponseEntity<String> putUser(@RequestBody TeachingCubeUser request){
		
		// TODO: replace with save to database
		dao_user.save(request);
		
		return new ResponseEntity<String>(HttpStatus.OK);
	}

	@RequestMapping(path = "/lesson", method = RequestMethod.PUT)
	public ResponseEntity<String> putLesson(@RequestBody TeachingCubeLesson request){
		
		// TODO: replace with save to database
		dao_lesson.save(request);
		
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
	@RequestMapping(path = "/user", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteUser(@RequestParam Integer userID){
		
		// TODO: after db is created, use DELETE function
		dao_user.delete(userID);
		
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
	@RequestMapping(path = "/user", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteLesson(@RequestParam Integer lessonID){
		
		// TODO: after db is created, use DELETE function
		dao_lesson.delete(lessonID);
		
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
}
