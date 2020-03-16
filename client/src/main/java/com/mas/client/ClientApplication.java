package com.mas.client;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mas.client.service.StudentService;

@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(ClientApplication.class, args);
		StudentService bean = run.getBean(StudentService.class);
		 ArrayList invokeRescourec = bean.invokeRescourec();
		System.out.println(invokeRescourec);
	}
	

}
