package com.mas.resource.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.Data;

@Data
@Entity
public class PdfDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pdfId;
	private Integer caseNum;
	@Lob
	@Column(name = "PDF_DEATILS")
	private byte[] pdfdeatils;
	private String createdBy;
	private String updatedBy;
	private Date createdDate;
	private Date updatedDate;
	
}
