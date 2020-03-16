package com.mas.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
 


@Entity
@SequenceGenerator(name = "mas",initialValue = 1,allocationSize = 100)
public class StudentDetails {
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator = "mas")
	
	private Long student_id;
	private String name;
	private String last;
	private String course;
	private String sem;
	private Integer age;
	private Integer moblie;
	

	public Long getStudent_id() {
		return student_id;
	}
	public void setStudent_id(Long student_id) {
		this.student_id = student_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getSem() {
		return sem;
	}
	public void setSem(String sem) {
		this.sem = sem;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getMoblie() {
		return moblie;
	}
	public void setMoblie(Integer moblie) {
		this.moblie = moblie;
	}
	@Override
	public String toString() {
		return "StudentDetails [student_id=" + student_id + ", name=" + name + ", last=" + last + ", course=" + course
				+ ", sem=" + sem + ", age=" + age + ", moblie=" + moblie + "]";
	}
	

	
}
