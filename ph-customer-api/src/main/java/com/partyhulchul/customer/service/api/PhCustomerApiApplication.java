package com.partyhulchul.customer.service.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class PhCustomerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhCustomerApiApplication.class, args);
	}
	
	@GetMapping("/customer/hello")
	private String hello() {
		return "Hello from Customer API through Zuul Gateway";
	}
}
