package com.mas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.mas.entity.StudentDetails;
import com.mas.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public boolean saveContact(StudentDetails student) {
		StudentDetails save = studentRepository.save(student);
		return save != null;

	}

	public List<StudentDetails> queryByExample(StudentDetails st) {

		Example<StudentDetails> ex = Example.of(st);
		List<StudentDetails> findAll = studentRepository.findAll(ex);

		return findAll;

	}

}
