package com.ohhoonim.exercise_springdata;

import org.springframework.boot.SpringApplication;

public class TestExerciseSpringdataApplication {

	public static void main(String[] args) {
		SpringApplication.from(ExerciseSpringdataApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
