package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(value="/hello")
	public String hello() {
		return "Hello";
	}
	
	@GetMapping(value="/test")
	public String test() {
		return "Test";
	}
}
