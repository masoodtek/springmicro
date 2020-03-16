package com.mas.service;

import java.util.Collection;
import java.util.List;

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
	public StudentDetails findByName(String name) {
		 StudentDetails save = studentRepository.findByName(name);
		return save;
		
	}
	/*
	 * public List<StudentDetails> findTop3() { List<StudentDetails> save =
	 * studentRepository.findTop3ByAge(); return save;
	 * 
	 * }
	 */
	public List<StudentDetails>  findByNameLike(String name) {
		List<StudentDetails> findByNameLike = studentRepository.findByNameLike(name);
		return findByNameLike;
		
	}
	public List<StudentDetails>  findByAgeLessThan(Integer age) {
		List<StudentDetails> findByAgeLessThan = studentRepository.findByAgeLessThan(age);
		return findByAgeLessThan;
		
	}
	public List<StudentDetails>  findByAgeLessThanEqual(Integer age) {
		List<StudentDetails> findByAgeLessThan = studentRepository.findByAgeLessThanEqual(age);
		return findByAgeLessThan;
		
	}
	public List<StudentDetails>  findByAgeGreaterThan(Integer age) {
		List<StudentDetails> findByAgeGreaterThan = studentRepository.findByAgeGreaterThan(age);
		return findByAgeGreaterThan;
		
	}
	public List<StudentDetails>  findByAgeGreaterThanEqual(Integer age) {
		List<StudentDetails> findByAgeGreaterThanEqual = studentRepository.findByAgeGreaterThanEqual(age);
		return findByAgeGreaterThanEqual;
		
	}
	public List<StudentDetails>  findByAgeBetween(Integer start,Integer end) {
		List<StudentDetails> findByAgeBetween = studentRepository.findByAgeBetween(start,end);
		return findByAgeBetween;
		
	}
	public List<StudentDetails>  findByAgeIn(Collection<Integer> age) {
		List<StudentDetails> findByAgeIn = studentRepository.findByAgeIn(age);
		return findByAgeIn;
		
	}
	public List<StudentDetails>  findByAgeBefore(Integer age) {
		List<StudentDetails> findByAgeBefore = studentRepository.findByAgeBefore(age);
		return findByAgeBefore;
		
	}
	public List<StudentDetails>  findByAgeAfter(Integer age) {
		List<StudentDetails> findByAgeAfter = studentRepository.findByAgeAfter(age);
		return findByAgeAfter;
		
	}
	public List<StudentDetails>  findByNameOrAge(String name,Integer age) {
		List<StudentDetails> findByNameOrAge = studentRepository.findByNameOrAge(name,age);
		return findByNameOrAge;
		
	}
	public List<StudentDetails>  findByNameOrLast(String name,String last) {
		List<StudentDetails> findByNameOrLast = studentRepository.findByNameOrLast(name,last);
		return findByNameOrLast;
		
	}
	public List<StudentDetails>  findByNameAndAge(String name,Integer age) {
		List<StudentDetails> findByNameAndAge = studentRepository.findByNameAndAge(name,age);
		return findByNameAndAge;
		
	}
	public List<StudentDetails>  findByCourseOrSemAndAge(String course,String sem,Integer ages) {
		List<StudentDetails> findByCourseOrSemAndAge = studentRepository.findByCourseOrSemAndAge(course, sem, ages);
		return findByCourseOrSemAndAge;
		
	}
	public List<StudentDetails>  findByNameOrderByName() {
		List<StudentDetails> findByNameOrderByName = studentRepository.findByNameOrderByName();
		return findByNameOrderByName;
		
	}
}
