package com.mas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring-boot-actuator")
public class ActautorController {
	@GetMapping("/hi")
	public String msg() {
		return "String boot actuator";
		
	}

}
