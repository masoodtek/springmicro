package com.mas.resource.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.mas.resource.model.CoTriggers;

public interface CoTriggersRepository extends JpaRepository<CoTriggers, Integer> {
	/*
	 * @Modifying
	 * 
	 * @Transactional
	 * 
	 * @Query(value =
	 * "UPDATE CO_TRIGGERS SET TRG_STATUS = 'C' WHERE CASE_NUM = :caseNumber",
	 * nativeQuery = true) public void updateStatus(Integer caseNumber);
	 */
}
