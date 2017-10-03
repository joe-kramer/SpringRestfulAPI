package com.joekramer.personalwebpage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.joekramer")
public class ToDoService {

	public static void main(String[] args) {
		SpringApplication.run(ToDoService.class, args);
	}
}
