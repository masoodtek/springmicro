package com.mas.resource.service;

import com.mas.resource.model.BatchRunDtls;

public interface BatchRunDtlsService {
	public Boolean saveBatchRunDtls(BatchRunDtls entity);
	public BatchRunDtls findByBatchName(String batchname);
}
