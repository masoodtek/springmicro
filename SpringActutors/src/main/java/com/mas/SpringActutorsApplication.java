package com.mas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.health.HealthProperties;
import org.springframework.boot.actuate.autoconfigure.security.reactive.EndpointRequest;
import org.springframework.boot.actuate.health.HealthEndpoint;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
public class SpringActutorsApplication extends WebSecurityConfigurerAdapter{
	
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().requestMatchers(EndpointRequest.to(HealthEndpoint.class)).permitAll()
		.antMatchers("/**").hasRole("USER").and().httpBasic();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringActutorsApplication.class, args);
	}

}
