package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Employ;
import com.example.demo.repo.EmployRepository;
import com.example.demo.service.EmployService;


@RestController
@RequestMapping(value="/api/wipro")
public class EmployController {

	@Autowired
	private EmployService employService;
	
	@Autowired
	private EmployRepository repository;
	
	@GetMapping("/employees")
	public List<Employ> getAllEmploys() {
		return employService.showEmploy();
	}
	
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employ> searchById(@PathVariable int id) throws ResourceNotFoundException {
		Employ employ = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employ Not Found For this ID " +id) );
		return ResponseEntity.ok().body(employ);
	}
	
	@PostMapping("/employees")
	public Employ addEmploy(@RequestBody Employ employ) {
		return repository.save(employ);
	}
	
	@PutMapping("/employees/{id}")
	public ResponseEntity<Employ> updateEmploy(@PathVariable int id, @RequestBody Employ employUpdated) throws ResourceNotFoundException {
		Employ employ = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employ Not Found For this ID " +id));
		Employ res = repository.save(employUpdated);
		return ResponseEntity.ok(res);
	}
	
	@DeleteMapping("/employees/{id}")
	public Map<String, Boolean> deleteEmploy(@PathVariable int id) throws ResourceNotFoundException {
		Employ employ = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employ Not Found For this ID " +id));
		repository.delete(employ);
		Map<String, Boolean> response = new HashMap<String, Boolean>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
