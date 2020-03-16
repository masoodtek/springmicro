package com.mas.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mas.model.Customers;
import com.mas.repository.CustomerRepository;
@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	
	public Optional<Customers> getCustomer(String i) {
		System.out.println("service"+i);
		Optional<Customers> findById = customerRepository.findById(i);
		System.out.println("Service"+findById);
		return findById;
		
	}

	public Boolean saveCustomer(Customers c) {
		Customers customers = customerRepository.save(c);
		return customers!=null;
		// TODO Auto-generated method stub
		
	}
}
