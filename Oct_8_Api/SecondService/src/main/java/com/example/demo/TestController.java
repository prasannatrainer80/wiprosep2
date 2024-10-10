package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class TestController {

	@GetMapping("/message")
	public String test() {
		return "Welcome to Second Service...from 9002 Port...";
	}

}