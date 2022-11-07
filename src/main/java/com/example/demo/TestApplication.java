package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication{

	public static void main(String[] args) {
		System.out.println("Hello world");
		SpringApplication.run(TestApplication.class, args);
	}

// 	@Override
// 	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
// 		return builder.sources(TestApplication.class);
// 	}
}
