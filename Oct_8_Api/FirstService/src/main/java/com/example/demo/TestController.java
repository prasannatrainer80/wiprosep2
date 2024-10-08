package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class TestController {

	@GetMapping("/message")
	public String test() {
		return "Welcome to API Gateway this is from FirstService...Actual Port is 9001";
	}

}
