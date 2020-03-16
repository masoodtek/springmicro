package com.mas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/jar")
	public String msg() {
		return "jar test program running!!!!!!!!!!!!!!";

	}

}
