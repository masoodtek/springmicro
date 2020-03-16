package com.mas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/welcome")
public class StudentController {

	@RequestMapping(method = RequestMethod.DELETE)
	public String welcome() {
		return "thank you";
	}
	
	  @RequestMapping(method = RequestMethod.GET) 
	  public String hi() { 
		  return "hello"; 
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
