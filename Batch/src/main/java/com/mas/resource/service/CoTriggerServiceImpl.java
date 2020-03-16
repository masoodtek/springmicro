package com.mas.resource.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mas.resource.model.CoTriggers;
import com.mas.resource.repository.CoTriggersRepository;
@Service
public class CoTriggerServiceImpl implements CoTriggerService {

	@Autowired
	private CoTriggersRepository coTriggersRepository;
	@Override
	public List<CoTriggers> findAllCoTrigger() {
		List<CoTriggers> findAll = coTriggersRepository.findAll();
		return findAll;
	}
	@Override
	public CoTriggers UpDateStatus(Integer Case) {
		Optional<CoTriggers> findById = coTriggersRepository.findById(Case);
		CoTriggers coTriggers = findById.get();
		coTriggers.setTrgStatus('c');
		CoTriggers coTriggers2 = coTriggersRepository.save(coTriggers);
		return coTriggers2;
	}

}
