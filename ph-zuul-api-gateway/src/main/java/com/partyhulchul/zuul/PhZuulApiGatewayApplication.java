package com.partyhulchul.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableOAuth2Sso
@EnableDiscoveryClient
public class PhZuulApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhZuulApiGatewayApplication.class, args);
	}
}
