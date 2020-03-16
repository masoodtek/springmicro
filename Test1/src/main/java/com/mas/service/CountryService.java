package com.mas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mas.model.Country;
import com.mas.repositrory.CountryRepositry;

@Service
public class CountryService {
	@Autowired
	private CountryRepositry countryRepositry;
	
	public Boolean saveCountry(Country c) {
		Country save = countryRepositry.save(c);
		return save!=null;
	}
}
