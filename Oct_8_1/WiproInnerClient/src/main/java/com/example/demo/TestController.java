package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/inter")
	public Object[] showEmploy() {
		Object[] employs = restTemplate.getForObject("http://WIPROCLIENT/employee/findall", Object[].class);
		return employs;
	}

}
