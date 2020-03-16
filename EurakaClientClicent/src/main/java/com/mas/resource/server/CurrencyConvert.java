package com.mas.resource.server;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CurrencyConvert {

	public Integer currencyConvert(String form,String to,Integer quantity) {
		String url="http://localhost:1111/currency/from/{from}/to/{to}";
		RestTemplate rt = new RestTemplate();
		Integer result = rt.getForObject(url,Integer.class,form,to);
		return result*quantity;
		
	}
}
