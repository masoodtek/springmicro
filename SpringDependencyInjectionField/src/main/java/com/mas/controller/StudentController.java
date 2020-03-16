package com.mas.controller;


import org.springframework.stereotype.Repository;

import com.mas.service.StudentService;

@Repository
public class StudentController {

	
	StudentService studentService = new StudentService();

	public String msg() {
		String msg = studentService.msg();
		return msg;
		
	}
	
	
	
	
	
}
