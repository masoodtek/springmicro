package com.mas.resource.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mas.resource.model.EligDtls;
import com.mas.resource.repository.EligDtlsRepository;
@Service
public class EligDtlsServiceImpl implements EligDtlsService {

	@Autowired
	private EligDtlsRepository eligDtlsRepository;
	
	@Override
	public EligDtls findEligDtlsByCaseNum(Integer caseNum) {
		EligDtls findByCaseNum = eligDtlsRepository.findByCaseNum(caseNum);
		return findByCaseNum;
	}

}
