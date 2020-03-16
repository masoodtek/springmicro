package com.mas.resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootMicroService02Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroService02Application.class, args);
	}

}
