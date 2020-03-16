package com.mas.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mas.service.StudentService;

@Controller
@ResponseBody
public class StudentController {
	@Autowired
	private StudentService studentService;
	public StudentController() {
		System.out.println("Student Controller");
	}
	@RequestMapping("/hi")
	public String msg() {
		String msg = studentService.msg();
		return msg;
		
	}
}
