package com.mas.repository;

import org.springframework.data.repository.CrudRepository;

import com.mas.entity.StudentDetails;

public interface StudentRepository extends CrudRepository<StudentDetails, Integer>{

}
