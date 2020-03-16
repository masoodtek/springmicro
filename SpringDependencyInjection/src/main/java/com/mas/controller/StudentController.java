package com.mas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mas.service.StudentService;

@Repository
public class StudentController {

	private StudentService studentService;
	@Autowired
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	public String msg() {
		String msg = studentService.msg();
		return msg;
		
	}
	
	
	
	
	
}
