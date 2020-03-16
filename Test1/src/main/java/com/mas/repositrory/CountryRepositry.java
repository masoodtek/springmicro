package com.mas.repositrory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mas.model.Country;

public interface CountryRepositry extends JpaRepository<Country,String> {

}
