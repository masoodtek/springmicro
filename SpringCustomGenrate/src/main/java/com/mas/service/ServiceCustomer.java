package com.mas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mas.model.Customers;
import com.mas.repository.CustomerRepository;

@Service
public class ServiceCustomer {

	@Autowired
	private CustomerRepository customerRepository;

	public Customers saveCustomer(Customers cus) {
		Customers customer = customerRepository.save(cus);
		return customer;

	}

}
