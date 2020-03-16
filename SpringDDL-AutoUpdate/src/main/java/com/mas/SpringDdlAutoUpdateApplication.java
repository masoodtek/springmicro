package com.mas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mas.entity.StudentDetails;
import com.mas.service.StudentService;


@SpringBootApplication
public class SpringDdlAutoUpdateApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDdlAutoUpdateApplication.class, args);
	 StudentService studentService = context.getBean(StudentService.class);
		StudentDetails contactEntity = new StudentDetails();
		contactEntity.setStudent_id(105);
		contactEntity.setName("vinay");
		contactEntity.setLast("pra");
		contactEntity.setAge(34);
		contactEntity.setCourse("ips");
		contactEntity.setSem("pass");
		contactEntity.setMoblie(90222222);
		
		boolean out = studentService.saveContact(contactEntity);
		System.out.println(out);
	}

}
