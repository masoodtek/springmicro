package com.mas;

import java.util.List;

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
		
//		  StudentEntity student = new StudentEntity(); student.setStudentId(103);
//		  student.setName("shama"); student.setLastName("akhatr");
//		  student.setCourse("big data"); student.setMobile(7877777); boolean adds =
//		  studentEntityImpl.add(student); System.out.println("vlaue is :::::"+adds);
		 
		//StudentEntity byName = studentEntityImpl.byName("masood");
		//System.out.println(byName);
		  
		  List<StudentEntity> top3byName = studentEntityImpl.top3byName();  
		  top3byName.forEach(tp3byNm -> System.out.println(tp3byNm));
		  System.out.println("-----------------------------------------------------------------------");
//		  List<StudentEntity> top3byCourse = studentEntityImpl.top3byCourse(); 
//		  top3byCourse.forEach(tp3byCurs -> System.out.println(tp3byCurs));
//		  System.out.println("-----------------------------------------------------------------------");
//		  List<StudentEntity> top3byMobile = studentEntityImpl.top3byMobile();  
//		  top3byMobile.forEach(tp3byMbl -> System.out.println(tp3byMbl));
		
	} 

}
