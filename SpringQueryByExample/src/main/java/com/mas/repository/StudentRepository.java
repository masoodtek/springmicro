package com.mas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import com.mas.entity.StudentDetails;

public interface StudentRepository extends JpaRepository<StudentDetails, Integer>,QueryByExampleExecutor<StudentDetails>{

}
