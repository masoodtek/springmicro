package com.mas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mas.entity.ContactEntity;
import com.mas.service.ContactService;

@SpringBootApplication
public class SpringCurdShowSqlApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringCurdShowSqlApplication.class, args);
		ContactService bean = context.getBean(ContactService.class);
		ContactEntity contactEntity = new ContactEntity();
		contactEntity.setContact_id(109);
		contactEntity.setName("rohit");
		contactEntity.setMobile(70000772);
		boolean out = bean.saveContact(contactEntity);
		System.out.println(out);
	}

}
