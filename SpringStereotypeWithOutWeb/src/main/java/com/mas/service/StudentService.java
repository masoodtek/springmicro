package com.mas.service;

import org.springframework.stereotype.Component;

@Component
public class StudentService {
	public StudentService() {
		System.out.println("Student Service");
	}

	public String servicemsg() {
		
		return "communicat to service in data";
	}

}
