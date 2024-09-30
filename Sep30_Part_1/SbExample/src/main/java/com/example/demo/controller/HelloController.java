package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/wipro")
public class HelloController {

	@GetMapping(value="/hello")
	public String sayHello() {
		return "Welcome to Spring Boot Programming...";
	}
	
	@GetMapping(value="/show/{sname}")
	public String show(@PathVariable String sname) {
		return "Hi I am " +sname;
	}
	
	@GetMapping(value="/sum/{a}/{b}")
	public String sum(@PathVariable int a, @PathVariable int b) {
		int c = a + b;
		String res = "";
		res+=c;
		return res;
	}
}
