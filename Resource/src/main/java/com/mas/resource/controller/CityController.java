package com.mas.resource.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mas.resource.domin.City;

import com.mas.resource.service.CityServiceImpl;

@RestController
public class CityController {
	@Autowired
	private CityServiceImpl cityServiceImpl;

	@GetMapping(value = "/showAllcity")
	public ResponseEntity<List<City>> getAllCity() {
		List<City> allCity = cityServiceImpl.getAllCity();
		ResponseEntity<List<City>> response = new ResponseEntity<List<City>>(allCity, HttpStatus.OK);
		return response;

	}
	@GetMapping(value = "/showCityById", produces = { "application/json", "application/xml" })
	public ResponseEntity<City> getCityById(@RequestParam("cityId") Integer cityId){
		City cityById = cityServiceImpl.getCityById(cityId);
		ResponseEntity<City> response = new ResponseEntity<City>(cityById,HttpStatus.OK);
		return response;
		
	}
	@PostMapping(value = "/savecity",
			produces = { "application/json", "application/xml" },
			consumes = { "application/json", "application/xml" })
	public ResponseEntity<Boolean> saveCity(@RequestBody City city){
		Boolean saveCity = cityServiceImpl.saveCity(city);
		ResponseEntity<Boolean> response = new ResponseEntity<Boolean>(saveCity,HttpStatus.CREATED);
		return response;
		
	}

}
