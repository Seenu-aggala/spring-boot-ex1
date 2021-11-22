package com.cnu.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	@GetMapping("/hello")
	private String helloMethod(@RequestParam String name) {
		return "Hello world..."+name;
	}

}
