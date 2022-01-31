package com.example.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SpringBackendProject2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBackendProject2Application.class, args);
		System.out.println("hii");
	}

}
