package com.mas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mas.model.Customers;

public interface CustomerRepository extends JpaRepository<Customers, String> {

}
