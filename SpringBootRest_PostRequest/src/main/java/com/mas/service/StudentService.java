package com.mas.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mas.model.Student;
import com.mas.model.Students;
import com.mas.repositery.StudentRepositrey;
@Service
public class StudentService {
	@Autowired
	private StudentRepositrey studentRepositrey;
	
	public void saveStudentRe(Students stu) {
		List<Student> stu1 = stu.getStudents();
		studentRepositrey.saveAll(stu1);
	}

}
