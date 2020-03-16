package com.mas.resource.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mas.resource.model.BatchRunDtls;

public interface BatchRunDtlsRepository extends JpaRepository<BatchRunDtls, Integer>{
public BatchRunDtls findByBatchName(String BatchName);
}
