package com.mas.client.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.mas.client.model.Flight;

@Configuration
public class StudentService {
public ArrayList invokeRescourec() {
	ArrayList respBody = null;
	String restUrl ="http://localhost:8085/viewAllData";
	RestTemplate rt = new RestTemplate();
	ResponseEntity<ArrayList> forEntity = rt.getForEntity(restUrl,ArrayList.class,"");
	Integer status = forEntity.getStatusCode().value();
	if(status==200) {
	 respBody = forEntity.getBody();
	}
		
	return respBody;
}

}
