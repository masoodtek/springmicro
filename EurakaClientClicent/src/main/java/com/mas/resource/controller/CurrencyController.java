package com.mas.resource.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mas.resource.server.CurrencyConvert;

@RestController
public class CurrencyController {
	@Autowired
	private CurrencyConvert currencyConvert;
	
	@GetMapping(value = "/Costcon/form/{form}/to/{to}/quantity/{quantity}")
	public ResponseEntity<Integer> convertedValue(@PathVariable("form")String form,@PathVariable("to")String to,@PathVariable("quantity")Integer quantity ){
		Integer convert = currencyConvert.currencyConvert(form, to,quantity);
		
		return new ResponseEntity<Integer>(convert,HttpStatus.OK);
		
	}

}
