package com.mas.resource.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mas.resource.model.BatchSummary;
import com.mas.resource.repository.BatchSummaryRepository;

@Service
public class BatchSummaryServiceImpl implements BatchSummaryService{
	@Autowired
	private BatchSummaryRepository batchSummaryRepository;
	@Override
	public Boolean saveBatchSummary(BatchSummary batchSummary) {
		BatchSummary save = batchSummaryRepository.save(batchSummary);
		return save!=null;
	}

}
