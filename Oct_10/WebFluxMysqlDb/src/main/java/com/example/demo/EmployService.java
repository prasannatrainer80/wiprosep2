package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EmployService {

	@Autowired
	private EmployRepository employRepository;
	
	public Flux<Employ> findAll() {
	    return employRepository.findAll();
	}
	
	public Mono<Employ> findById(int empno) {
	    return employRepository.findById(empno);
	  }

	  public Mono<Employ> save(Employ employ) {
	    return employRepository.save(employ);
	  }

	  public Mono<Employ> update(Employ employ) {
		 
		return  employRepository.save(employ);
	  }

	  public Mono<Void> deleteById(int id) {
	    return employRepository.deleteById(id);
	  }
	
}
