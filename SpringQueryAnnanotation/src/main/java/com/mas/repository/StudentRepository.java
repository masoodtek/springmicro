package com.mas.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.mas.entity.StudentDetails;

public interface StudentRepository extends CrudRepository<StudentDetails, Integer>{
	public StudentDetails findByName(String name);
	//#public List<StudentDetails> findTop3ByAge();
	public List<StudentDetails> findByNameLike(String pattern);
	public List<StudentDetails> findByAgeLessThan(Integer age);
	public List<StudentDetails> findByAgeLessThanEqual(Integer age);
	public List<StudentDetails> findByAgeGreaterThan(Integer age);
	public List<StudentDetails> findByAgeGreaterThanEqual(Integer age);
	public List<StudentDetails> findByAgeBetween(Integer start,Integer end);
	public List<StudentDetails> findByAgeIn(Collection<Integer> ages);
	public List<StudentDetails> findByAgeBefore(Integer ages);
	public List<StudentDetails> findByAgeAfter(Integer ages);
	public List<StudentDetails> findByNameOrAge(String name,Integer ages);
	public List<StudentDetails> findByNameOrLast(String name,String last);
	public List<StudentDetails> findByNameAndAge(String name,Integer ages);
	public List<StudentDetails> findByCourseOrSemAndAge(String course,String sem,Integer ages);
	@Query(value="from StudentDetails ORDER BY age ASC")
	public List<StudentDetails> findByNameOrderByAge();
	@Query(value="Select * from StudentDetails ORDER BY name DESC",nativeQuery =true )
	public List<StudentDetails> findByNameOrderByName();
	

}
