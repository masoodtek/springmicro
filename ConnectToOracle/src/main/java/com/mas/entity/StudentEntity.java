package com.mas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name = "s1")
public class StudentEntity {

	@Id
	@Column(name = "studentId")
	private Integer studentId;
	@Column(name = "name")
	private String name;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "course")
	private String course;
	@Column(name = "mobile")
	private Integer mobile;
	@Column(name = "age")
	private Integer age;
	@Column(name = "city")
	private String city;

	public StudentEntity(int i, String string, String string2, String string3, int j, int k, String string4) {
		// TODO Auto-generated constructor stub
	}

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

	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "StudentEntity [studentId=" + studentId + ", name=" + name + ", lastName=" + lastName + ", course="
				+ course + ", mobile=" + mobile + ", age=" + age + ", city=" + city + "]";
	}

}
