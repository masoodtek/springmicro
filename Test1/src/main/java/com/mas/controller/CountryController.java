package com.mas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mas.model.Country;
import com.mas.service.CountryService;

@Controller
@ResponseBody
public class CountryController {
  @Autowired
  private CountryService countryService;
  @GetMapping("/add")
  public String saveCountry(@RequestBody Country c) {
	  Boolean saveCountry = countryService.saveCountry(c);
	return "saved";
	  
  }
}
