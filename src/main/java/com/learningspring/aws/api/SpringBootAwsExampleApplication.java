package com.learningspring.aws.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootAwsExampleApplication {

	@GetMapping("/home")
	public String home(){
		return "Welcome to your first Rest API running on AWS";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAwsExampleApplication.class, args);
	}

}
