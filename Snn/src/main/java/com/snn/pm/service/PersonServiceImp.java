package com.snn.pm.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snn.pm.domean.Person;
import com.snn.pm.entity.PersonEntity;
import com.snn.pm.repository.PersonRepository;

@Service
public class PersonServiceImp implements PersonService {
	@Autowired
	private PersonRepository personRepository;

	@Override
	public Person savePersonDetails(Person person) {
		PersonEntity personEntity = new PersonEntity();
		BeanUtils.copyProperties(person, personEntity);
		PersonEntity save = personRepository.save(personEntity);
		Person person1 = new Person();
		BeanUtils.copyProperties(save, person1);
		
		return person1;
	}
	
}
