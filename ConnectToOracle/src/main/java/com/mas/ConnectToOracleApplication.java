package com.mas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mas.entity.StudentEntity;
import com.mas.service.StudentEntityImpl;


@SpringBootApplication
public class ConnectToOracleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ConnectToOracleApplication.class, args);
		StudentEntityImpl studentEntityImpl = context.getBean(StudentEntityImpl.class);
		StudentEntity student = new StudentEntity(101,"masood","akhtar","mca",78787878,25,"jabalpur"); 
		String add1 = studentEntityImpl.add(student);
		System.out.println("vlaue is :::::"+add1);
	} 

}
