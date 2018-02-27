package com.teaching_cube.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.teaching_cube.model.TeachingCubeUser;

@Controller
@RequestMapping("/teaching-cube")
public class TeachingCubeController {
	
	/* Endpoints:
	 * Get Lesson Plan
	 * 
	 */
	
	
	//Get User from DB
	//This maps request in URL after /user 
	@RequestMapping(path = "/user", method = RequestMethod.GET)
	//ResponseType JSON
	public static ResponseEntity<TeachingCubeUser> getUser(@RequestParam String username){
		
		TeachingCubeUser testuser = new TeachingCubeUser();
		testuser.setUserName(username);
		ResponseEntity<TeachingCubeUser> response = new ResponseEntity<TeachingCubeUser>(testuser, HttpStatus.OK);
		
		return response;
		
	}
	
	

}
