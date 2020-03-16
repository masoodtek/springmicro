package com.mas.resource.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerUtils {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)  
		          .select()                                  
		          .apis(RequestHandlerSelectors.basePackage("com.mas.resource.controller"))              
		          .paths(PathSelectors.any())                          
		          .build() 
				  .apiInfo(userInfo());
	}
	public ApiInfo userInfo() {
		ApiInfo api = new ApiInfo("cityfinder","base on the city stateid","7.1","http://localhost:9091","Masood Akhtar","ISO:254-584-111","http://localhost:9091");
		return api;
		
	}

}
