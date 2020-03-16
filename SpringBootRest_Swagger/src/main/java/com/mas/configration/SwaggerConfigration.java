package com.mas.configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mas.model.Student;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@Configuration
@EnableSwagger2
public class SwaggerConfigration {
	@Bean
	 public Docket api() { 
	        return new Docket(DocumentationType.SWAGGER_2)  
	          .select()                                  
	          .apis(RequestHandlerSelectors.basePackage("com.mas.controller"))              
	          .paths(PathSelectors.any())                          
	          .build()
	          .apiInfo(getApiContactDtls());
	    }
	
	public ApiInfo getApiContactDtls() {
		Student student = new Student();
		ApiInfo apiInfo = new ApiInfo("SpringBootRest_swagger","Student Details","7.1","www.cooltees.com", "8085324400","www.cooltees.co/license","www.cooltees.co");
		return apiInfo;
	}
	
}
