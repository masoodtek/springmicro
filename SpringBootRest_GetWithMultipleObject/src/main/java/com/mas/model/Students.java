package com.mas.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Students")
public class Students {
private List<Student> students;

public List<Student> getStudents() {
	return students;
}

public void setStudents(List<Student> students) {
	this.students = students;
}

}
