package com.mas.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mas.entity.StudentEntity;

public interface StudentRepository extends CrudRepository<StudentEntity, Integer>{
	public StudentEntity findByName(String name);
	public List<StudentEntity> findTop3ByName();
	//public List<StudentEntity> findTop3ByCourse();
	//public List<StudentEntity> findTop3ByMobile();

}
