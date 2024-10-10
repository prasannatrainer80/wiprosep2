package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class EmployController {

	@Autowired
	private EmployService employService;
	
	@GetMapping(value="/showEmploy")
	public Flux<Employ> showEmploy() {
		return employService.showEmployDao();
	}
	
	@GetMapping(value="/searchEmploy/{id}")
	public Mono<Employ> searchEmploy(@PathVariable int id) {
		return employService.findByEmpId(id);
	}
}
