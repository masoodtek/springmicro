package com.mas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.mas.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	public StudentController() {
		System.out.println("Student Controller");
	}
	
	public String msg() {
		String msg = studentService.servicemsg();
		return msg;
		
	}
}
