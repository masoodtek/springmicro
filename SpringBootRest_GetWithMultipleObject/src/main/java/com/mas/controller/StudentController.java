package com.mas.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mas.model.Student;
import com.mas.model.Students;

@RestController
public class StudentController {
	
	

	@GetMapping(value = "/hi", produces = { "application/json", "application/xml" })
	public Students get() {
		Students s = new Students();
		List<Student> listStudent = new ArrayList<Student>();
		Student student = new Student("masood","akhtar");
		Student student1 = new Student("javed","akhtar");
		Student student2= new Student("shama","afreen");
		listStudent.add(student);
		listStudent.add(student1);
		listStudent.add(student2);
		s.setStudents(listStudent);
		return s;
	}

}
