package com.mas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mas.controller.StudentController;

@SpringBootApplication
public class SpringStereotypeWithOutWebApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext Context = SpringApplication.run(SpringStereotypeWithOutWebApplication.class, args);
		StudentController bean = Context.getBean(StudentController.class);
		String msg = bean.msg();
		System.out.println(msg);
	}

}
