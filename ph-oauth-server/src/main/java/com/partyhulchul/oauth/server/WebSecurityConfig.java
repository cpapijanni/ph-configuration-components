package com.partyhulchul.oauth.server;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@Order(-20)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Bean
	@Override		
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {			
		http
			.formLogin().permitAll()
		.and()
			.requestMatchers().antMatchers("/login", "/oauth/authorize", "/oauth/confirm_access")
		.and()
			.authorizeRequests().anyRequest().authenticated();
	}	
}