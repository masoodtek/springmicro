package com.mas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mas.entity.StudentEntity;
import com.mas.repository.StudentRepository;

@Service
public class StudentEntityImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public String add(StudentEntity student) {
		  StudentEntity entity = studentRepository.save(student);
		
		return "save";
	}

}
