package com.mas.resource.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mas.resource.service.CurrencyServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value = "curreny converstion operation app", description = "use to reterive data into currency table")
public class CurrencyController {
	@Autowired
	private CurrencyServiceImpl currencyServiceImpl;

	@ApiOperation(value = "give converted currency record into database", response = Integer.class)

	@ApiResponses(value = {

			@ApiResponse(code = 200, message = "Successfully retrieved list"),

			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),

			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),

			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	@ApiParam(value = "give value of give input", required = true)
	@GetMapping(value = "/currency/from/{from}/to/{to}")
	public ResponseEntity<Integer> getCurrencyValue(@PathVariable("from") String from, @PathVariable("to") String to) {
		Integer currencyValue = currencyServiceImpl.getCurrencyValue(from, to);
		ResponseEntity<Integer> response = new ResponseEntity<Integer>(currencyValue, HttpStatus.OK);
		return response;

	}

}
