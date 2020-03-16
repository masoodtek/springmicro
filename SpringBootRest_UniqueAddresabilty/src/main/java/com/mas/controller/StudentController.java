package com.mas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/welcome")
public class StudentController {

	@RequestMapping("/welcome1")
	public String welcome() {
		return "thank you";
	}
	
	  @RequestMapping("/hi") 
	  public String hi() { 
		  return "hello"; 
	  }
	  
	  @RequestMapping("/whatsup")
	  public String whatsup() { 
		  return "cool"; 
		  }
	  
	  @RequestMapping("/yo")
	  public String yo() { 
		  return "yo";
	  }
}
