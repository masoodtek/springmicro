package com.mas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//for one property file 
//@PropertySource("classpath:ab.properties")

//for multiple property file 
//all properties file should be resent otherwise it will throw an exception say fileNotFoundExceptin
@PropertySource({"classpath:ab.properties",
	"classpath:bc.properties",
	//"classpath:c.properties"
})
public class SpringChangePropertyFilePathApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringChangePropertyFilePathApplication.class, args);
	}

}
