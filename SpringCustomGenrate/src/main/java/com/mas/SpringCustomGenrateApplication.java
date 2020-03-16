package com.mas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mas.model.Customers;
import com.mas.service.ServiceCustomer;

@SpringBootApplication
public class SpringCustomGenrateApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringCustomGenrateApplication.class, args);
		ServiceCustomer bean = context.getBean(ServiceCustomer.class);
		Customers cus = new Customers();
		cus.setName("javed");
		cus.setLastName("akhtar");
		cus.setMobile(797777772);
		bean.saveCustomer(cus);
	}

}
