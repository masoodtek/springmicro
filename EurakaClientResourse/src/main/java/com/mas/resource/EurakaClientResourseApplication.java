package com.mas.resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurakaClientResourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurakaClientResourseApplication.class, args);
	}

}
