package com.mas.repository;

import org.springframework.data.repository.CrudRepository;

import com.mas.entity.ContactEntity;

public interface ContactRepository extends CrudRepository<ContactEntity, Integer>{

}
