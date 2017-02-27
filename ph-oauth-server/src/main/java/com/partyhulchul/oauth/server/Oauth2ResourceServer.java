package com.partyhulchul.oauth.server;

import java.security.Principal;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableResourceServer
@EnableWebSecurity
@RestController
public class Oauth2ResourceServer extends ResourceServerConfigurerAdapter {
	
	private static final String RESOURCE_ID = "ph-resource";
	
	@RequestMapping("/user")
	@ResponseBody
	public Principal user(Principal user) {
		return user;
	}

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.requestMatchers()
			.antMatchers("/**")
			.and()
			.authorizeRequests()
			.anyRequest()
			.access("#oauth2.hasScope('read')");
	}

	@Override
	public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
		resources.resourceId(RESOURCE_ID);
	}
}
