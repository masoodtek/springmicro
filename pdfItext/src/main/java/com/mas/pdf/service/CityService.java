package com.mas.pdf.service;

import java.util.List;

import com.mas.pdf.domin.City;
import com.mas.pdf.model.CityEntity;

public interface CityService {
	
	public List<City> getAllCity();
	public City getCityById(Integer i);
	public Boolean saveCity(City city);
}
