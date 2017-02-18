package com.partyhulchul.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PhEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhEurekaServerApplication.class, args);
	}
}
