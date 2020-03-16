package com.mas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mas.entity.ContactEntity;
import com.mas.service.ContactService;

@SpringBootApplication
public class SpringCurdOperPreMethodApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringCurdOperPreMethodApplication.class, args);
		ContactService bean = context.getBean(ContactService.class);
//save method
		/*
		 * ContactEntity contactEntity = new ContactEntity();
		 * contactEntity.setContact_id(108); contactEntity.setName("javed");
		 * contactEntity.setMobile(900980282); boolean out =
		 * bean.saveContact(contactEntity); System.out.println(out);
		 */
		
//count method
		/*
		 * Long countContact = bean.countContact(); System.out.println(countContact);
		 */
		
// hashCode  method
		/*
		 * Integer hashCodeContact = bean.hashCodeContact();
		 * System.out.println(hashCodeContact);
		 */
		
//existsById  method
		/*
		 * boolean existsByIdContact = bean.existsByIdContact(202);
		 * System.out.println(existsByIdContact);
		 */
		
//findAll method
		/*
		 * Iterable<ContactEntity> findAllContact = bean.findAllContact();
		 * findAllContact.forEach(f->System.out.println(f));
		 */
		
//findAllById method
		/*
		 * Integer[] a= {102,106,108}; Iterable<Integer> id =Arrays.asList(a);
		 * Iterable<ContactEntity> findAllById = bean.findAllById(id);
		 * findAllById.forEach(f->System.out.println(f));
		 */
		
//findById method
		/*
		 * Optional<ContactEntity> findById = bean.findById(202);
		 * System.out.println(findById);
		 */
		
//saveAll method
		/*
		 * List<ContactEntity> l = new ArrayList<ContactEntity>(); l.add(new
		 * ContactEntity(109,"sonu",808532440)); l.add(new
		 * ContactEntity(110,"ravi",808537777)); l.add(new
		 * ContactEntity(111,"mona",808532771)); Iterable<ContactEntity> saveAllContact
		 * = bean.saveAllContact(l); saveAllContact.forEach(f->System.out.println(f));
		 */
		
//deleteContact
	//with object its work
		/*
		 * ContactEntity contactEntity = new ContactEntity(101,"masood",78787878); boolean
		 * deleteContact = bean.deleteContact(contactEntity);
		 * System.out.println(deleteContact);
		 */
	//with pare-shell object its working
		/*
		 * ContactEntity contactEntity = new ContactEntity(102,"amit"); boolean
		 * deleteContact = bean.deleteContact(contactEntity);
		 * System.out.println(deleteContact);
		 */
		
//deleteById method
		/*
		 * boolean deleteByIdContact = bean.deleteByIdContact(103);
		 * System.out.println(deleteByIdContact);
		 */
		
//deleteAll method
		/*
		 * List<ContactEntity> l = new ArrayList<ContactEntity>(); l.add(new
		 * ContactEntity(109,"sonu",808532440)); l.add(new
		 * ContactEntity(110,"ravi",808537777)); l.add(new
		 * ContactEntity(111,"mona",808532771)); bean.deleteAllContact(l);
		 */
		
		//deleteAll method
		/*
		 * boolean deleteAllContact = bean.deleteAllContact();
		 * System.out.println(deleteAllContact);
		 */
	}

}
