package com.mas.resource.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mas.resource.model.BatchRunDtls;
import com.mas.resource.repository.BatchRunDtlsRepository;

@Service
public class BatchRunDtlsServiceImpl implements BatchRunDtlsService {
	@Autowired
	private BatchRunDtlsRepository batchRunDtlsRepository;

	@Override
	public Boolean saveBatchRunDtls(BatchRunDtls entity) {
		BatchRunDtls save = batchRunDtlsRepository.save(entity);
		return save != null;
	}

	@Override
	public BatchRunDtls findByBatchName(String batch) {
		System.out.println(batch);
		BatchRunDtls findByBatchName = batchRunDtlsRepository.findByBatchName(batch);
		System.out.println(findByBatchName+"bch25");

		return findByBatchName;
	}

}
