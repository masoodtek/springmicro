package com.mas.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "contactenti")
public class ContactEntity {
	@Id
	private Integer contact_id;
	private String name;
	private Integer moblie;
	
	public Integer getContact_id() {
		return contact_id;
	}
	public void setContact_id(Integer contactId) {
		this.contact_id = contactId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMobile() {
		return moblie;
	}
	public void setMobile(Integer mobile) {
		this.moblie = mobile;
	}
	
}
