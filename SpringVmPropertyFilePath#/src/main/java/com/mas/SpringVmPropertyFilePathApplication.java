package com.mas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//for multiple property file 
//all properties file should be resent otherwise it will throw an exception say fileNotFoundExceptin
@PropertySource("classpath:c.properties")
public class SpringVmPropertyFilePathApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringVmPropertyFilePathApplication.class, args);
	}

}
