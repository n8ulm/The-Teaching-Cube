package com.teaching_cube.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.teaching_cube.crud.TeachingCubeLessonRepo;
import com.teaching_cube.crud.TeachingCubeSessionRepo;
import com.teaching_cube.crud.TeachingCubeUserLessonRepo;
import com.teaching_cube.crud.TeachingCubeUserRepo;
import com.teaching_cube.model.TeachingCubeLesson;
import com.teaching_cube.model.TeachingCubeSession;
import com.teaching_cube.model.TeachingCubeUser;
import com.teaching_cube.model.TeachingCubeUserLesson;

@Controller
@RequestMapping("/teaching-cube")
public class TeachingCubeController {

	@Autowired
	TeachingCubeUserRepo teachingCubeUserRepo;
	@Autowired
	TeachingCubeLessonRepo teachingCubeLessonRepo;
	@Autowired
	TeachingCubeSessionRepo teachingCubeSessionRepo;
	@Autowired
	TeachingCubeUserLessonRepo teachingCubeUserLessonRepo;

	// Get User from DB
	// This maps request in URL after /user
	@RequestMapping(path = "/user", method = RequestMethod.GET)
	public ResponseEntity<TeachingCubeUser> getUser(@RequestParam String userName) {

		ResponseEntity<TeachingCubeUser> response = new ResponseEntity<TeachingCubeUser>(
				teachingCubeUserRepo.findByUserName(userName).get(), HttpStatus.OK);

		return response;

	}

	// Get Lesson from DB
	@RequestMapping(path = "/lesson", method = RequestMethod.GET)
	@CrossOrigin
	public ResponseEntity<TeachingCubeLesson> getLesson(@RequestParam Integer lessonID) {

		ResponseEntity<TeachingCubeLesson> response = new ResponseEntity<TeachingCubeLesson>(
				teachingCubeLessonRepo.findById(lessonID).get(), HttpStatus.OK);

		return response;
	}

	// Get Session from DB
	@RequestMapping(path = "/session", method = RequestMethod.GET)
	public ResponseEntity<TeachingCubeSession> getSession(@RequestParam Integer sessionID) {

		ResponseEntity<TeachingCubeSession> response = new ResponseEntity<TeachingCubeSession>(
				teachingCubeSessionRepo.findById(sessionID).get(), HttpStatus.OK);

		return response;
	}

	// Get UserLesson from DB
	@RequestMapping(path = "/user/{userName}/lesson/{lessonId}", method = RequestMethod.GET)
	public ResponseEntity<TeachingCubeUserLesson> getUserLesson(@PathVariable String userName,
			@PathVariable Integer lessonId) {
		ResponseEntity<TeachingCubeUserLesson> response = new ResponseEntity<>(
				teachingCubeUserLessonRepo.findByUserNameAndLessonID(userName, lessonId).get(), HttpStatus.OK);
		return response;
	}

	// Post User
	@RequestMapping(path = "/user", method = RequestMethod.POST)
	public ResponseEntity<String> postUser(@RequestBody TeachingCubeUser request) {

		teachingCubeUserRepo.save(request);

		return new ResponseEntity<String>(HttpStatus.CREATED);
	}

	// Post Lesson
	@RequestMapping(path = "/lesson", method = RequestMethod.POST)
	public ResponseEntity<String> postLesson(@RequestBody TeachingCubeLesson request) {

		teachingCubeLessonRepo.save(request);

		return new ResponseEntity<String>(HttpStatus.CREATED);
	}

	// Post Session
	@RequestMapping(path = "/session", method = RequestMethod.POST)
	public ResponseEntity<String> postSession(@RequestBody TeachingCubeSession request) {

		teachingCubeSessionRepo.save(request);

		return new ResponseEntity<String>(HttpStatus.CREATED);
	}

	// Put User
	@RequestMapping(path = "/user", method = RequestMethod.PUT)
	public ResponseEntity<String> putUser(@RequestBody TeachingCubeUser request) {

		teachingCubeUserRepo.save(request);

		return new ResponseEntity<String>(HttpStatus.OK);
	}

	// Put Lesson
	@RequestMapping(path = "/lesson", method = RequestMethod.PUT)
	public ResponseEntity<String> putLesson(@RequestBody TeachingCubeLesson request) {

		teachingCubeLessonRepo.save(request);

		return new ResponseEntity<String>(HttpStatus.OK);
	}

	// Put Session
	@RequestMapping(path = "/session", method = RequestMethod.PUT)
	public ResponseEntity<String> putSession(@RequestBody TeachingCubeSession request) {

		teachingCubeSessionRepo.save(request);

		return new ResponseEntity<String>(HttpStatus.OK);
	}

	// Delete User
	@RequestMapping(path = "/user", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteUser(@RequestParam String userName) {

		teachingCubeUserRepo.deleteByUserName(userName);

		return new ResponseEntity<String>(HttpStatus.OK);
	}

	// Delete Lesson
	@RequestMapping(path = "/lesson", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteLesson(@RequestParam Integer lessonID) {

		teachingCubeLessonRepo.deleteById(lessonID);

		return new ResponseEntity<String>(HttpStatus.OK);
	}

	// Delete Session
	@RequestMapping(path = "/session", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteSession(@RequestParam Integer sessionID) {

		teachingCubeSessionRepo.deleteById(sessionID);

		return new ResponseEntity<String>(HttpStatus.OK);
	}

}
