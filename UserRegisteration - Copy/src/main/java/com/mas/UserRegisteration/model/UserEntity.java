package com.mas.UserRegisteration.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name = "USERDTS")
public class UserEntity {
	@Id
	@GenericGenerator(strategy = "com.mas.UserRegisteration.utils.CustomGenrateUtil", name = "cid_gen")
	@GeneratedValue(generator = "cid_gen")
	@Column(name = "USERID")
	private String userId;
	@Column(name = "USERNAME")
	private String userName;
	@Column(name = "LASTNAME")
	private String userLastName;
	@Column(name = "EMAIL")
	private String userEmail;
	@Column(name = "PAZZWORD")
	private String userPazzword;
	@Column(name = "MOBILE")
	private String userPhonenumber;
	@Column(name = "DOB")
	private Date dateOfBirth;
	@Column(name = "GENDER")
	private Character gender;
	@Column(name = "CITYID")
	private Integer cityId;
	@Column(name = "STATEID")
	private Integer stateId;
	@Column(name = "COUNTRYID")
	private Integer countryId;
	@Column(name = "ACTIVEFLAG")
	private Character activeFlag;
	@CreationTimestamp()
	@Temporal(TemporalType.DATE)
	@Column(name = "CREATEDDATE")
	private Date createdDate;

	@Column(name = "UPDATEDATE")
	@UpdateTimestamp
	@Temporal(TemporalType.DATE)
	private Date updatedDate;
	@Column(name = "CREATEDBY")
	private String createdBy;
	@Column(name = "UPDATEBY")
	private String updatedBy;

}
