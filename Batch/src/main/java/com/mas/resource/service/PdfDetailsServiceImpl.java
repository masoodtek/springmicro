package com.mas.resource.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.mas.resource.model.PdfDetails;
import com.mas.resource.repository.PdfDetailsRepostory;

@Service
public class PdfDetailsServiceImpl {
	@Autowired
	private PdfDetailsRepostory pdfDetailsRepostory;

	public String savePdfDeatis(Integer caseNumber,Integer count) {
		System.out.println(count);
		String fileName = "F:\\software\\pdf\\cogendly"+count+".pdf";

		PdfDetails pdfDtls = new PdfDetails();
		pdfDtls.setCaseNum(caseNumber);
		pdfDtls.setPdfdeatils(fileName.getBytes());
		pdfDetailsRepostory.save(pdfDtls);
		return fileName;

	}
}
