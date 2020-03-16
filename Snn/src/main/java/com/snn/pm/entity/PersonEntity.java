package com.snn.pm.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class PersonEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer personId;
	private String firstName;
	private String lastName;
	private String gender;
	private Date dateOfBirth;
	
	
}
