package com.mas.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mas.model.Student;

@RestController
public class StudentController {

	@GetMapping(value = "/hi", produces = { "application/json", "application/xml" })
	public Student get(@RequestParam("name") String name) {
		Student student = new Student("masood", "akhtar");
		if (name == student.getName()) {
			System.out.println("true");
			student.setLast("raien");
		}
		return student;
	}

}
