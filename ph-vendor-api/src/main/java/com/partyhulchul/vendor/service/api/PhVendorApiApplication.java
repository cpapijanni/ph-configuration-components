package com.partyhulchul.vendor.service.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class PhVendorApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhVendorApiApplication.class, args);
	}
	
	@GetMapping("/vendor/hello")
	private String hello() {
		return "Hello from Vendor API through Zuul Gateway";
	}
}
