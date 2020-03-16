package com.mas.resource.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mas.resource.model.StudentEntity;
import com.mas.resource.repostiory.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;
	
	public List<StudentEntity> getStudentRecord(){
		 List<StudentRepository> list = studentRepository.findAll();
		return findAll;
		
	}

}
