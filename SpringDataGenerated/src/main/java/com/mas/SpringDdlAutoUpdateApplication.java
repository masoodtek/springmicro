package com.mas;

import java.util.List;

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
		
		  // ADD DATA FUN WITH SAVE METHOD
		  
		/*
		 * StudentDetails contactEntity = new StudentDetails();
		 * contactEntity.setName("mohit"); contactEntity.setLast("bass");
		 * contactEntity.setAge(30); contactEntity.setCourse("mca");
		 * contactEntity.setSem("pass"); contactEntity.setMoblie(700700744); boolean
		 * saveContact = studentService.saveContact(contactEntity);
		 * System.out.println(saveContact);
		 * 
		 */
		
		
		
		  List<StudentDetails> findAll = studentService.findAll(); findAll.forEach(p->
		  System.out.println(p));
		 
		 
		 
	}

}
