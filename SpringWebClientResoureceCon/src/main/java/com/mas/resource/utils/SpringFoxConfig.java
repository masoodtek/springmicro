package com.mas.resource.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import com.mas.resource.model.CurrencyEntity;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SpringFoxConfig {                                    
    @Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("com.mas.resource.controller"))              
          .paths(PathSelectors.any())                          
          .build() 
          .apiInfo(getApiContactDtls() );
    }
    
    public ApiInfo getApiContactDtls() {
    	CurrencyEntity student = new CurrencyEntity();
		ApiInfo apiInfo = new ApiInfo("SpringBootRest_swagger","Currency Details","7.1","www.tekleads.com", "8085324400","www.tekleads.co/license","www.tekleads.co");
		return apiInfo;
	}
}
