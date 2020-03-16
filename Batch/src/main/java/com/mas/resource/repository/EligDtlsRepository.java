package com.mas.resource.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mas.resource.model.EligDtls;

public interface EligDtlsRepository extends JpaRepository<EligDtls, Integer>{
	
public EligDtls findByCaseNum(Integer caseNum);
}
 