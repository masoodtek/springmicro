package com.mas.client.model;

import lombok.Data;

@Data
public class Flight {
	 private String code;
	 private float price;
	 private String origin;
	 private String destination;
	 private String departureDate;
	 private String planeType;
	 private String airlineName;
	 private float emptySeats;
}
