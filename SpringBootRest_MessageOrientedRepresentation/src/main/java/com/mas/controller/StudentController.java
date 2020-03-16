package com.mas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mas.model.Student;

@RestController
@RequestMapping(value="/welcome")
public class StudentController {

	@RequestMapping(method = RequestMethod.DELETE)
	public String welcome() {
		return "thank you";
	}
	
	  @GetMapping(produces = {"application/json","application/xml"}) 
	  public Student get() {
		  Student student = new Student("masood","akhtar");
		  return student; 
	  }
	  
	  @RequestMapping(method = RequestMethod.POST)
	  public String whatsup() { 
		  return "cool"; 
		  }
	  
	  @RequestMapping(method = RequestMethod.PUT)
	  public String yo() { 
		  return "yo";
	  }
	  @RequestMapping(value="/hii",method = RequestMethod.GET) 
	  public String hii() { 
		  return "hello2"; 
	  }
}
