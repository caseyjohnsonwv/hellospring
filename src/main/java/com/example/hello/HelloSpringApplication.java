package com.example.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class HelloSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}
	
	@RequestMapping("/")
	public static String index() {
		return "Greetings from Spring Boot!";
	}
	
	@RequestMapping("/hello")
	public static String hello(@RequestParam(name="name", defaultValue="World") String name) {
		return String.format("Hello, %s!", name);
	}

}
