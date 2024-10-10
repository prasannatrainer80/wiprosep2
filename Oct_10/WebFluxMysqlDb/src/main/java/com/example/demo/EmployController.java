package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class EmployController {

	@Autowired
	private EmployService employService;
	
	 @GetMapping("/employs")
//	  @ResponseStatus(HttpStatus.OK)
	  public Flux<Employ> getAllemploys() {
		 return employService.findAll();
	  }
	 
	 @GetMapping("/employs/{id}")
//	  @ResponseStatus(HttpStatus.OK)
	  public Mono<Employ> getemployById(@PathVariable("id") int id) {
	    return employService.findById(id);
	  }

	  @PostMapping("/addEmploy")
//	  @ResponseStatus(HttpStatus.CREATED)
	  public Mono<Employ> createemploy(@RequestBody Employ employ) {
	    return employService.save(employ);
	  }

//	  @PutMapping("/updateEmploy")
////	  @ResponseStatus(HttpStatus.OK)
//	  public Mono<Employ> updateemploy( @RequestBody Employ employ) {
//	    return employService.update(id, employ);
//	  }

	  @DeleteMapping("/employ/{id}")
//	  @ResponseStatus(HttpStatus.NO_CONTENT)
	  public Mono<Void> deleteemploy(@PathVariable("id") int id) {
	    return employService.deleteById(id);
	  }
}
