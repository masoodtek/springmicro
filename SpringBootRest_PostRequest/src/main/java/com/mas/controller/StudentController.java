package com.mas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.mas.model.Students;
import com.mas.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService stuService;

	@PostMapping(value = "/hi", consumes = { "application/json", "application/xml" })
	public ResponseEntity<String> get(@RequestBody Students stu) {
		stuService.saveStudentRe(stu);
		String msg = "contacts is saves";
		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
	}

}
