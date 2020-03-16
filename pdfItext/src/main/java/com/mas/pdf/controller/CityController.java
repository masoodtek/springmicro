package com.mas.pdf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RestController;

import com.mas.pdf.domin.City;
import com.mas.pdf.service.CityServiceImpl;
import com.mas.pdf.utils.GeneratePdfReport;

import lombok.var;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.ByteArrayInputStream;

@RestController
public class CityController {
	@Autowired
	private CityServiceImpl cityServiceImpl;

	@RequestMapping(value = "/pdfreport", method = RequestMethod.GET, produces = MediaType.APPLICATION_PDF_VALUE)
	public ResponseEntity<InputStreamResource> citiesReport() {

		var cities = (List<City>) cityServiceImpl.getAllCity();

		ByteArrayInputStream bis = GeneratePdfReport.citiesReport(cities);

		var headers = new HttpHeaders();
		headers.add("Content-Disposition", "inline; filename=citiesreport.pdf");

		return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF)
				.body(new InputStreamResource(bis));
	}

}
