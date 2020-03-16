package com.mas.resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mas.resource.service.CurrenctService;

@SpringBootApplication
public class SpringBootMicroService03Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootMicroService03Application.class, args);
		CurrenctService bean = context.getBean(CurrenctService.class);
	}

}
