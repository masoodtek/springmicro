package com.mas.resource.service;

import java.util.List;

import com.mas.resource.model.CoTriggers;

public interface CoTriggerService {
	public List<CoTriggers> findAllCoTrigger();
	public CoTriggers UpDateStatus(Integer Case);

}
