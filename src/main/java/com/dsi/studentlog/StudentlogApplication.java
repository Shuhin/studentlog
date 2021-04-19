package com.dsi.studentlog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StudentlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentlogApplication.class, args);
	}

}
