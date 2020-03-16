package com.mas.resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mas.resource.batch.CoZenDly;

@SpringBootApplication
public class BatchApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BatchApplication.class, args);
		 CoZenDly bean = context.getBean(CoZenDly.class);
		 bean.preProcess();
	}

}
