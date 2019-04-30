package com.vadik.basespring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BaseSpringApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(BaseSpringApplication.class, args);
	}

	@Override
	public void run(String... args) {

	}
}