package com.mas.resource.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class BatchSummary {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer summaryId;
	private String batchName;
	private String summaryDtls;
	private String createdBy;
	private String updatedBy;
	private Date createdDate;
	private Date updatedDate;

}