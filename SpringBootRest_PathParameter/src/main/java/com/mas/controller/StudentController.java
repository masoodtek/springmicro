package com.mas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mas.model.Student;

@RestController
public class StudentController {

	@GetMapping(value = "/hi/{name}/hello", produces = { "application/json", "application/xml" })
	public Student get(@PathVariable("name") String name) {
		Student student = new Student();
		student.setName("masood");
		student.setLast("akhtar");
			if (name == student.getName()) {
				System.out.println("true");
				student.setLast("raien");
			}
		return student;
	}

}
