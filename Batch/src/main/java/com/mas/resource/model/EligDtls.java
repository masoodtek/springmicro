package com.mas.resource.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class EligDtls {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer eligId;
	private Integer benefitAmount;
	private Integer caseNum;
	private String planName;
	private Character denialReason;
	private Character planStatus;
	private Date planStartDt;
	private Date planEndDt;
	private String createdBy;
	private String updatedBy;
	private Date createdDate;
	private Date updatedDate;
	
}
