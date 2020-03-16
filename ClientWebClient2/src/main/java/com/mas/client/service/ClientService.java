package com.mas.client.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.mas.client.model.City;

@Service
public class ClientService {
	
	public String clientrRequest() {
		WebClient.Builder builder = WebClient.builder();
		WebClient wedClient = builder.build();
		String block = wedClient.get()
		.uri("http://localhost:9091/showAllcity")
		.retrieve()
		.bodyToMono(String.class)
		.block();
		return block;
		
	}
	public void clientrRequestAsyn(City city) {
	
		WebClient.Builder builder = WebClient.builder();
		 System.out.println("Asyno call=================================");
		WebClient webClient = builder.build();
		webClient.post()
		.uri("http://localhost:9091/savecity")
		.body(BodyInserters.fromObject(city))
		.retrieve()
		.bodyToMono(String.class)
		.subscribe(ClientService :: handlerResponse);
	}
	public static void handlerResponse(String response) {
		System.out.println(response);
	}


}
