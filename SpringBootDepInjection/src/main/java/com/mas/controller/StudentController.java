package com.mas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mas.service.StudentService;

@Repository
public class StudentController {
	/*
	 * @Autowired private StudentService studentService1;
	 * 
	 * 
	 * @Autowired private StudentService studentService2; public void
	 * setStudentService2(StudentService studentService2) {
	 * 
	 * this.studentService2 = studentService2; }
	 */
	  @Autowired private StudentService studentService3;
	 
	
	public StudentController(StudentService studentService3) {
		super();
		this.studentService3 = studentService3;
	}


	//StudentService studentService3 = new StudentService();


	public String msg() {
		//System.out.println("filed--------------------"+studentService1.toString());
	//	System.out.println("setter--------------------"+studentService2.toString());
		System.out.println("con------------------------"+studentService3.toString());
		String msg = studentService3.msg();
		
		return msg;
		
	}
	
	
	
	
	
}
