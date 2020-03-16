package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.domin.Student;

@Controller
public class StudentController {
	
    @RequestMapping("/load")
	public String FormLoad(Model model) {
		Student st = new Student();
		model.addAttribute("Student",st);
		return "load";
		
	}
}
