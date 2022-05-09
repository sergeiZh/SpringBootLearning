package com.zh.sergei.learn.user.learning.user;

import com.zh.sergei.learn.user.learning.user.annotation.EnableLogTracking;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableLogTracking
public class LearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningApplication.class, args);
	}

}
