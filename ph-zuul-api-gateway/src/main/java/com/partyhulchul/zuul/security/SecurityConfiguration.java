//package com.partyhulchul.zuul.security;
//
//import java.io.IOException;
//import java.util.ArrayList;
//
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.Cookie;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.boot.autoconfigure.security.SecurityProperties;
//import org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoRestTemplateCustomizer;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.Ordered;
//import org.springframework.core.annotation.Order;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.oauth2.client.OAuth2RestTemplate;
//import org.springframework.security.web.csrf.CsrfFilter;
//import org.springframework.security.web.csrf.CsrfToken;
//import org.springframework.security.web.csrf.CsrfTokenRepository;
//import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//import org.springframework.web.util.WebUtils;
//
//@Configuration
//@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//	private static final String CSRF_COOKIE_NAME = "XSRF-TOKEN";
//	private static final String CSRF_HEADER_NAME = "X-XSRF-TOKEN";
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests().antMatchers("/**", "/oauth/token", "/oauth/authorize").permitAll().anyRequest()
//				.authenticated().and().csrf().csrfTokenRepository(csrfTokenRepository()).and()
//				.addFilterAfter(csrfHeaderFilter(), CsrfFilter.class);
//	}
//
//	private Filter csrfHeaderFilter() {
//		return new OncePerRequestFilter() {
//			@Override
//			protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
//					FilterChain filterChain) throws ServletException, IOException {
//				CsrfToken csrf = (CsrfToken) request.getAttribute(CsrfToken.class.getName());
//				if (csrf != null) {
//					Cookie cookie = WebUtils.getCookie(request, CSRF_COOKIE_NAME);
//					String token = csrf.getToken();
//					if (cookie == null || token != null && !token.equals(cookie.getValue())) {
//						cookie = new Cookie(CSRF_COOKIE_NAME, token);
//						cookie.setPath("/");
//						response.addCookie(cookie);
//					}
//				}
//				filterChain.doFilter(request, response);
//			}
//		};
//	}
//
//	private static CsrfTokenRepository csrfTokenRepository() {
//		HttpSessionCsrfTokenRepository repository = new HttpSessionCsrfTokenRepository();
//		repository.setHeaderName(CSRF_HEADER_NAME);
//		return repository;
//	}
//}
//
//@Component
//@Order(Ordered.HIGHEST_PRECEDENCE)
//class WorkaroundRestTemplateCustomizer implements UserInfoRestTemplateCustomizer {
//
//	@Override
//	public void customize(OAuth2RestTemplate template) {
//		template.setInterceptors(new ArrayList<>(template.getInterceptors()));
//	}
//
//}