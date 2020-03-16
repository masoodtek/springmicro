package com.mas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mas.controller.StudentController;

@SpringBootApplication
public class SpringDependencyInjectionConApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDependencyInjectionConApplication.class, args);
		StudentController bean = context.getBean(StudentController.class);
		String msg = bean.msg();
		System.out.println(msg);
	}

}
