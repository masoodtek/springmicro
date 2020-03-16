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
		 * contactEntity.setStudent_id(105); contactEntity.setName("shama");
		 * contactEntity.setLast("raien"); contactEntity.setAge(25);
		 * contactEntity.setCourse("llb"); contactEntity.setSem("pass");
		 * 
		 * boolean out = studentService.saveContact(contactEntity);
		 * System.out.println(out);
		 */
		StudentDetails s = new StudentDetails();
		s.setSem("pass");
		s.setLast("raien");
		s.setCourse("m.com");
		List<StudentDetails> byExample = studentService.queryByExample(s);
		byExample.forEach(p -> System.out.println(p));

	}

}
