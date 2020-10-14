package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootInstargramV5Application {

	public static void main(String[] args) {
		System.out.println("어드민 페이지로 왔습니다");
		SpringApplication.run(SpringbootInstargramV5Application.class, args);
	}

}
