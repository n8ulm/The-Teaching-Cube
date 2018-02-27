package com.teaching_cube.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.teaching_cube.controller")
public class TeachingCubeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeachingCubeApplication.class, args);
		
		
	
	}
}
