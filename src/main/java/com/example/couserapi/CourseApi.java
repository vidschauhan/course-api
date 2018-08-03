package com.example.couserapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages={"com.example.*"})
public class CourseApi {

	public static void main(String[] args) {
		SpringApplication.run(CourseApi.class, args);
	}

}
