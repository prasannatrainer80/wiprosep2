package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Employ;
import com.example.demo.repo.EmployRepository;

@Service
public class EmployService {

	@Autowired
	private EmployRepository repo;
	
	public List<Employ> showEmploy() {
		return repo.findAll();
	}
	
	public void deleteEmploy(int empno) {
		repo.deleteById(empno);
	}
	
	public Employ searchEmploy(int empno) {
		return repo.findById(empno).get();
	}
	
	public void addEmploy(Employ employ) {
		repo.save(employ);
	}
	
	public void update(Employ employ) {
		repo.save(employ);
	}
}
