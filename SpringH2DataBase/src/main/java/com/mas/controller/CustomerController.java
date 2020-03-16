package com.mas.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mas.model.Customers;
import com.mas.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerService;

	@RequestMapping("/map/{id}")
	public Optional<Customers> getCustomers(@PathVariable String id) {
		System.out.println(id);
		
		Optional<Customers> customer = customerService.getCustomer(id);
		System.out.println(customer);
		return customer;

	}
	@PostMapping("/cus")
	public Boolean saveCustomer(@PathVariable Customers c) {
		System.out.println(c);
		Boolean saveCustomer = customerService.saveCustomer(c);
		return saveCustomer;
		
	}
}
