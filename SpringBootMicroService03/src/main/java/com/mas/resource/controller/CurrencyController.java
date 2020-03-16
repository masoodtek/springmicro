package com.mas.resource.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mas.resource.service.CurrenctService;

@RestController
public class CurrencyController {
	
	@Autowired
	private CurrenctService currenctService;

	@GetMapping(value = "/value/from/{from}/to/{to}")
	public ResponseEntity<String> currenecyValue(@PathVariable("from") String from, @PathVariable("to") String to) {
		String changeCurreney = currenctService.ChangeCurreney(from,to);
		System.out.println(changeCurreney);
		return new ResponseEntity<String>(changeCurreney,HttpStatus.OK);

	}

}
