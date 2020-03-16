package com.mas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
	public List<StudentDetails> pagination(Integer value){
		//PageRequest first = PageRequest.of("page number"+value, "page size"+4)
		PageRequest first = PageRequest.of(value, 4, Sort.by("age"));
		
		//Pageable firstPageWithTwoElements = PageRequest.of(value, 4);
		Page<StudentDetails> allProducts = studentRepository.findAll(first);
		 
		List<StudentDetails> allTenDollarProducts = 
				allProducts.getContent();
		return allTenDollarProducts;
		
	}

}
