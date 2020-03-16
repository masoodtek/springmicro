package com.mas.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mas.model.Student;
import com.mas.model.Students;

public interface StudentRepositrey extends JpaRepository<Student, String>{

}
