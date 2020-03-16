package com.mas.resource.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class CoTriggers {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer triggerId;
	private Integer caseNum;
	private String batchName;
	private String noticeId;
	private Character trgStatus;
	private String createdBy;
	private String updatedBy;
	private Date createdDate;
	
	private Date updatedDate;
	
}
