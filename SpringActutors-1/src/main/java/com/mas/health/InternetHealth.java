package com.mas.health;

import java.net.URL;
import java.net.URLConnection;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class InternetHealth implements HealthIndicator{

	@Override
	public Health health() {
		Health health = null;
		health = checkInternet()==true?Health.up().withDetail("success code", "active Internet Connection").build()
				:Health.down().withDetail("error code", "doen Internet Connection").build();
		return health;
	}
	private boolean checkInternet() {
		boolean flag = false;
		try {
			URL url = new URL("https://www.google.com");
			URLConnection openConnection = url.openConnection();
			openConnection.connect();
			flag = true;
		}catch(Exception e) {
			flag = false;
		}
		return flag;
		
		
		
	}

}
