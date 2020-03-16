package com.mas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mas.entity.ContactEntity;
import com.mas.repository.ContactRepository;

@Service
public class ContactService {
	
	@Autowired
	 private ContactRepository contactRepository;
	
	public boolean saveContact(ContactEntity entity) {
		ContactEntity save = contactRepository.save(entity);
		return save!=null;
		
	}

}
