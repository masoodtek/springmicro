package com.mas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;


@Entity
@Table(name = "stud")
public class StudentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "sid")
	private Integer studentId;

	@Column(name = "sname")
	private String name;

	@Column(name = "slastName")
	private String lastName;

	@Column(name = "scourse")
	private String course;

	@Column(name = "smobile")
	private Integer mobile;

	

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Integer getMobile() {
		return mobile;
	}

	public void setMobile(int i) {
		this.mobile = i;
	}

	@Override
	public String toString() {
		return "StudentEntity [studentId=" + studentId + ", name=" + name + ", lastName=" + lastName + ", course="
				+ course + ", mobile=" + mobile + "]";
	}

	public StudentEntity() {
		super();
	}
	
	

}
