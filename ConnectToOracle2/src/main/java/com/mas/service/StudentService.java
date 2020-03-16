package com.mas.service;

import java.util.List;

import com.mas.entity.StudentEntity;

public interface StudentService {
public boolean add(StudentEntity student);
public StudentEntity byName(String name);
public List<StudentEntity> top3byName();
//public List<StudentEntity> top3byCourse();
//public List<StudentEntity> top3byMobile();

}
