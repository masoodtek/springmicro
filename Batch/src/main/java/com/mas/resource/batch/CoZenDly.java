package com.mas.resource.batch;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.mas.resource.model.BatchRunDtls;
import com.mas.resource.model.BatchSummary;
import com.mas.resource.model.CoTriggers;
import com.mas.resource.model.EligDtls;
import com.mas.resource.service.BatchRunDtlsServiceImpl;
import com.mas.resource.service.BatchSummaryServiceImpl;
import com.mas.resource.service.CoTriggerServiceImpl;
import com.mas.resource.service.EligDtlsServiceImpl;
import com.mas.resource.service.PdfDetailsServiceImpl;
import com.mas.resource.utils.PdfGenerater;

@Component
public class CoZenDly {

	public static Integer SUCCESS = 0;
	public static Integer FAIL = 0;

	@Autowired
	private CoTriggerServiceImpl coTriggerServiceImpl;

	@Autowired
	private EligDtlsServiceImpl eligDtlsServiceImpl;
	@Autowired
	private PdfGenerater pdfGenerater;
	@Autowired
	private PdfDetailsServiceImpl pdfDetailsServiceImpl;
	@Autowired
	private BatchRunDtlsServiceImpl batchRunDtlsServiceImpl;
	@Autowired
	private BatchSummaryServiceImpl batchSummaryServiceImpl;
	
	public void preProcess() {
		BatchRunDtls batchRunDtls = new BatchRunDtls();
		Calendar c1 = Calendar.getInstance(); 
		batchRunDtls.setBatchName("CoNotDly");
		batchRunDtls.setStartTime(c1.getTime());
		Boolean saveBatchRunDtls = batchRunDtlsServiceImpl.saveBatchRunDtls(batchRunDtls);
		start();
	}

	public void start() {
		List<CoTriggers> findAllCoTrigger = coTriggerServiceImpl.findAllCoTrigger();
		Integer count =0;
		for (CoTriggers fag : findAllCoTrigger) {
			count++;
			process(fag,count);
		}
		postProcess();
	}

	public void process(CoTriggers coTri,Integer count) {
		Integer caseNum = coTri.getCaseNum();
		try {
			EligDtls eligDtls = eligDtlsServiceImpl.findEligDtlsByCaseNum(caseNum);
			pdfGenerater.pdfGenreater(eligDtls,count);
			String deatis = pdfDetailsServiceImpl.savePdfDeatis(caseNum,count);
			 CoTriggers upDateStatus = coTriggerServiceImpl.UpDateStatus(caseNum);
			SUCCESS++;
		} catch (Exception e) {
			FAIL++;
			e.printStackTrace();
		}
	}

	public void postProcess() {
		Calendar c1 = Calendar.getInstance(); 
		BatchRunDtls findByBatchName = batchRunDtlsServiceImpl.findByBatchName("CoNotDly");
		
		findByBatchName.setCurrRunStatus('c');
		findByBatchName.setEndTime(c1.getTime());
		Boolean dtls = batchRunDtlsServiceImpl.saveBatchRunDtls(findByBatchName);
		BatchSummary batchSummary = new BatchSummary();
		batchSummary.setBatchName(findByBatchName.getBatchName());
		batchSummary.setSummaryDtls("number of Success="+SUCCESS+"and number of failer ="+FAIL);
		Boolean saveBatchSummary = batchSummaryServiceImpl.saveBatchSummary(batchSummary);
		
	}
}
