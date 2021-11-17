package com.codervi.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("Hello Codervi.com");
		System.out.println("Hello Test");
		System.out.println("Hello Test2");
		SpringApplication.run(DemoApplication.class, args);
	}

}
