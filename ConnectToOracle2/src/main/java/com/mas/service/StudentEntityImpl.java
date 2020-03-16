package com.mas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mas.entity.StudentEntity;
import com.mas.repository.StudentRepository;

@Service
public class StudentEntityImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public boolean add(StudentEntity student) {
		  StudentEntity entity = studentRepository.save(student);
		  
		
		return entity!=null;
	}

	@Override
	public StudentEntity byName(String name) {
		studentRepository.findByName(name);
		return studentRepository.findByName(name);
	}

	@Override
	public List<StudentEntity> top3byName() {
		
		return studentRepository.findTop3ByName( );
	}

	

//	@Override
//	public List<StudentEntity> top3byCourse() {
//		// TODO Auto-generated method stub
//		return studentRepository.findTop3ByCourse();
//	}
//
//	@Override
//	public List<StudentEntity> top3byMobile() {
//		// TODO Auto-generated method stub
//		return studentRepository.findTop3ByMobile();
//	}

}
