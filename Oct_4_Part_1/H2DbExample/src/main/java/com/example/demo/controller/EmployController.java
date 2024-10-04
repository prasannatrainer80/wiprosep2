package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	private EmployService service;
	
	@GetMapping(value="/showEmploy")
	public List<Employ> showEmployDao() {
		return service.showEmployDao();
	}
	
	@GetMapping(value="/searchEmploy/{empno}")
	public Employ searchEmployDao(@PathVariable int empno) {
		return service.searchEmployDao(empno);
	}
	
	@PostMapping(value="/addEmploy")
	public String addEmployDao(@RequestBody Employ employ) {
		return service.addEmployDao(employ);
	}
	
	@PutMapping(value="/updateEmploy")
	public String updateEmployDao(@RequestBody Employ employ) {
		return service.updateEmployDao(employ);
	}
	
	@DeleteMapping(value="/deleteEmploy")
	public String deleteEmployDao(int empno) {
		return service.deleteEmployDao(empno);
	}
	
}
