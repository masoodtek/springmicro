package com.mas.repository;

import org.springframework.data.repository.CrudRepository;

import com.mas.entity.StudentEntity;

public interface StudentRepository extends CrudRepository<StudentEntity, Integer>{

}
