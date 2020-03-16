package com.mas.resource.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mas.resource.domin.City;
import com.mas.resource.model.CityEntity;
import com.mas.resource.reopsitory.CityRepository;
@Service
public class CityServiceImpl implements CityService{
	@Autowired
	private CityRepository cityRepository;

	@Override
	public List<City> getAllCity() {
		List<City> citylists = new ArrayList<City>();
		List<CityEntity> findAll = cityRepository.findAll();
		System.out.println(findAll);
		for(CityEntity citylist: findAll) {
			City city = new City();
			BeanUtils.copyProperties(citylist,city);
			citylists.add(city);
		}
		return citylists;
	}

	@Override
	public City getCityById(Integer i) {
		
		Optional<CityEntity> findById = cityRepository.findById(i);
		CityEntity cityEnt =findById.get();
		City city = new City();
		BeanUtils.copyProperties(cityEnt,city); 
		return city;
	};

	@Override
	public Boolean saveCity(City city) {
		CityEntity cityEntity = new CityEntity(); 
		BeanUtils.copyProperties(city,cityEntity);
		CityEntity save = cityRepository.save(cityEntity);
		return save!=null;
	}

}
