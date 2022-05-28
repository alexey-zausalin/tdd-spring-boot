package com.github.alexeyzausalin.tddspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class TddSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(TddSpringBootApplication.class, args);
	}

}
