package com.mas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Data

public class Customers {
	@Id
	@GenericGenerator(strategy ="com.mas.customgenrater.CustomGenrater", name = "cid_gen")
	@GeneratedValue(generator = "cid_gen")
	private String customers_Id;
	private String name;
	@Column(name = "LASTNAME")
	private String lastName;
	private Integer mobile;

	public String getCustomer_Id() {
		return customers_Id;
	}

	public void setCustomer_Id(String customer_Id) {
		this.customers_Id = customer_Id;
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

	public Integer getMobile() {
		return mobile;
	}

	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}

}
