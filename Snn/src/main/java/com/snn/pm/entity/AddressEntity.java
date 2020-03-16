package com.snn.pm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class AddressEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer addressId;
	private String addressLine1;
	private String addressLine2;
	private String state;
	private String city;
	//private PersonEntity personEntity;

}
