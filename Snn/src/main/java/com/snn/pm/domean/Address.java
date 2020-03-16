package com.snn.pm.domean;

import com.snn.pm.entity.PersonEntity;

import lombok.Data;
@Data
public class Address {
	private Integer addressId;
	private String addressLine1;
	private String addressLine2;
	private String state;
	private String city;
	private Integer personEntity;
}
