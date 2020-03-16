package com.mas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.mas.entity.StudentDetails;

public interface StudentRepository extends JpaRepository<StudentDetails, Integer>{

}
