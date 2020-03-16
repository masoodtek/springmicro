package com.mas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mas.entity.ContactEntity;
import com.mas.service.ContactService;

@SpringBootApplication
public class SpringCurdOprationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringCurdOprationApplication.class, args);
		ContactService bean = context.getBean(ContactService.class);
		ContactEntity contactEntity = new ContactEntity();
		contactEntity.setContact_id(107);
		contactEntity.setName("shama");
		contactEntity.setMobile(620000788);
		boolean out = bean.saveContact(contactEntity);
		System.out.println(out);
	}

}
