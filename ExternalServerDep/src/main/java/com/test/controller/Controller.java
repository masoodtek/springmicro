package com.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@RequestMapping("/hi")
	public String masg() {
		System.out.println("hello");
		return "hello";
	}

}
