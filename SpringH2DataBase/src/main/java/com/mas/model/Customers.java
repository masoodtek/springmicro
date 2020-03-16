package com.mas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Customers {
	
	@GenericGenerator(strategy ="com.mas.customgenrater.CustomGenrater", name = "cid_gen")
	@GeneratedValue(generator = "cid_gen")
	@Id
	private String customers_Id;
	private String name;
	//@Column(name = "LASTNAME")
	private String lastName;
	private Integer mobile;
	
	public String getCustomers_Id() {
		return customers_Id;
	}

	public void setCustomers_Id(String customers_Id) {
		this.customers_Id = customers_Id;
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

	@Override
	public String toString() {
		return "Customers [customers_Id=" + customers_Id + ", name=" + name + ", lastName=" + lastName + ", mobile="
				+ mobile + "]";
	}
	
}