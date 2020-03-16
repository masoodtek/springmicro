package com.snn.pm.domean;

import java.util.Date;

import lombok.Data;


@Data
public class Person {
	private Integer personId;
	private String firstName;
	private String lastName;
	private String gender;
	private Date dateOfBirth;
	

}
