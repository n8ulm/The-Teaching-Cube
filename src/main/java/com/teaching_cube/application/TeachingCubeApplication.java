package com.teaching_cube.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages= {"com.teaching_cube.controller"})
@EntityScan(basePackages={"com.teaching_cube.model"})
@EnableJpaRepositories(basePackages={"com.teaching_cube.crud"}) 
public class TeachingCubeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeachingCubeApplication.class, args);
		
		
	
	}
}
