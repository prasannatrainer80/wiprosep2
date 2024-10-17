package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employ;
import com.example.demo.repo.EmployRepository;

@Service
public class EmployService {

	@Autowired
	private EmployRepository employRepository;
	
	public List<Employ> showEmploy() {
		return employRepository.findAll();
	}
	
	public Employ searchEmploy(int empno) {
		return employRepository.findById(empno).get();
	}
	
	public void addEmploy(Employ employ) {
		employRepository.save(employ);
	}
	
	public Employ updateEmploy(Employ employ) {
		return employRepository.save(employ);
	}
	
	public void deleteEmploy(int id) {
		employRepository.deleteById(id);
	}
}
