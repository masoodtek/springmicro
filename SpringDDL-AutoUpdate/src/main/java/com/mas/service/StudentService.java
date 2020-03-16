package com.mas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mas.entity.StudentDetails;
import com.mas.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	 private StudentRepository studentRepository;
	
	public boolean saveContact(StudentDetails student) {
		 StudentDetails save = studentRepository.save(student);
		return save!=null;
		
	}

}
