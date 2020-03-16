package com.mas.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Repository;

@Repository
@Order(1)
public class CmdRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("CmdRunner::run() method called");
		
	}

}
