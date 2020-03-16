package com.mas.resource.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mas.resource.model.CurrencyEntity;
import com.mas.resource.repostiory.CurrencyRepository;

@Service
public class CurrencyServiceImpl implements CurrencyService{
	@Autowired
	private CurrencyRepository currencyRepository;
	@Override
	public Integer getCurrencyValue(String from, String to) {
		CurrencyEntity andCurrencyTo = currencyRepository.findByCurrencyFromAndCurrencyTo(from, to);
		Integer response = andCurrencyTo.getCurrencyValue();
		System.out.println(response);
		return response;
	}

}
