package com.mas.resource.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class CurrenctService {
	public String ChangeCurreney(String from, String to) {
		String url ="http://localhost:9091/currency/from/{from}/to/{to}";
		
		WebClient.Builder builder = WebClient.builder();
		WebClient wedClient = builder.build();
		String block = wedClient.get()
				.uri(url,from,to)
				.retrieve()
				.bodyToMono(String.class)
				.block();
		
		return block;
	}

}
