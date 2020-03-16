package com.mas.resource.service;

import java.util.List;

import com.mas.resource.domin.City;
import com.mas.resource.model.CityEntity;

public interface CityService {
	
	public List<City> getAllCity();
	public City getCityById(Integer i);
	public Boolean saveCity(City city);
}
