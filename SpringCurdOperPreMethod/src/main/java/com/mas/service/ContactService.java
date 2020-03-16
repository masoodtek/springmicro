package com.mas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mas.entity.ContactEntity;
import com.mas.repository.ContactRepository;

@Service
public class ContactService {
	
	@Autowired
	 private ContactRepository contactRepository;
	private long count;
	
	public boolean saveContact(ContactEntity entity) {
		ContactEntity save = contactRepository.save(entity);
		return save!=null;
		
	}
	
	public Long countContact() {
		count = contactRepository.count();
		return count;
		
	}
	public Integer hashCodeContact() {
		Integer hashCode = contactRepository.hashCode();
		return hashCode;
		
	}
	
	public boolean existsByIdContact(Integer id) {
		boolean existsById = contactRepository.existsById(id);
		return existsById;
		
	}
	public  Iterable<ContactEntity> findAllContact() {
		 Iterable<ContactEntity> findAll = contactRepository.findAll();
		return findAll;
		
	}
	
	public  Iterable<ContactEntity> findAllById(Iterable<Integer> id) {
		 Iterable<ContactEntity> findAllById = contactRepository.findAllById(id);
		return findAllById;
		
	}
	public   Optional<ContactEntity> findById(Integer id) {
		 Optional<ContactEntity> findById = contactRepository.findById(id);
		return findById;
		
	} 
	public  Iterable<ContactEntity>  saveAllContact(Iterable<ContactEntity> entities) {
		 Iterable<ContactEntity> saveAll = contactRepository.saveAll(entities);
		return saveAll;
		
	} 
	public boolean deleteContact(ContactEntity id) {
		 contactRepository.delete(id);
		return  true;
		
	} 
	public boolean deleteByIdContact(Integer id) {
		 contactRepository.deleteById(id);
		return  true;
		
	} 
	public boolean deleteAllContact(Iterable<ContactEntity> entities) {
		 contactRepository.deleteAll(entities);
		return  true;
		
	} 
	public boolean deleteAllContact() {
		 contactRepository.deleteAll();
		return  true;
		
	} 
	
}
