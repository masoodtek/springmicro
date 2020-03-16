package com.mas.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Student")
@Entity
public class Student {
	@Id
	private String name;
	private String last;

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

	public Student(String name, String last) {
		super();
		this.name = name;
		this.last = last;
	}

	public Student() {

	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", last=" + last + "]";
	}

}
