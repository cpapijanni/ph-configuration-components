package com.partyhulchul.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class PhConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhConfigServerApplication.class, args);
	}
}
