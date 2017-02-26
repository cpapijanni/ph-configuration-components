package com.partyhulchul.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class PhSearchApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhSearchApiApplication.class, args);
	}
	
	@GetMapping("/search/hello")
	private String hello() {
		return "Hello from Search API through Zuul Gateway";
	}
}
