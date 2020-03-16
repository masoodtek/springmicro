package com.mas.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mas.client.model.City;
import com.mas.client.service.ClientService;

@SpringBootApplication
public class ClientWebClient2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ClientWebClient2Application.class, args);
		 ClientService bean = context.getBean(com.mas.client.service.ClientService.class);
		 String clientrRequest = bean.clientrRequest();
		  
		 System.out.println("syno call=================================");
		 System.out.println(clientrRequest);
		 System.out.println("Asyno call=================================");
		 City ct = new City();
		 ct.setCityId(48);
		 ct.setCityName("masiid");
		 ct.setStateId(9);
		 bean.clientrRequestAsyn(ct);
		
		
		
	}

}
