package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employ;
import com.example.demo.service.EmployService;

@RestController
@RequestMapping(value="/employ")
public class EmployController {

	@Autowired
	private EmployService employService;
	
	@GetMapping(value="/show/{pageNo}/{pageSize}/{sortBy}/{sortDirection}")
	public List<Employ> findAll(@PathVariable int pageNo, @PathVariable int pageSize,
						@PathVariable String sortBy, @PathVariable String sortDirection
					) {
		Page<Employ> result = employService.findAll(pageNo, pageSize, sortBy, sortDirection);
		return result.getContent();
	}
	
	@GetMapping(value="/showEmploy")
	public List<Employ> showEmploy() {
		return employService.showEmploy();
	}
	
	@GetMapping(value="/searchEmploy/{id}")
	public Employ searchEmploy(@PathVariable int id) {
		return employService.searchEmploy(id);
	}
	
	@DeleteMapping(value="/deleteEmploy/{id}")
	public String deleteEmploy(@PathVariable int id) {
		return employService.deleteEmploy(id);
	}
	@PostMapping(value="/addEmploy")
	public String addEmploy(@RequestBody Employ employ) {
		return employService.addEmploy(employ);
	}
	
	@PutMapping(value="/addEmploy")
	public String updageEmploy(@RequestBody Employ employ) {
		return employService.updateEmploy(employ);
	}
	
	
}
