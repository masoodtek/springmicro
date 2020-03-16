package com.snn.pm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.snn.pm.entity.PersonEntity;

public interface PersonRepository extends JpaRepository<PersonEntity, Integer>{

}
