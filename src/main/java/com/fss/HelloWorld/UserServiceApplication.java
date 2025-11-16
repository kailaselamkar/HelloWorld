package com.fss.HelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserServiceApplication {

	public static void main(String[] args) {
		System.out.println("This is a test application.Hello World");
		SpringApplication.run(UserServiceApplication.class, args);
		System.out.println(" Added test for N8N integration ");

	}

}
