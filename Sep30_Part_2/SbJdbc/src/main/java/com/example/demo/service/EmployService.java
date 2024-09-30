package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employ;
import com.example.demo.repo.EmployRepository;

@Service
public class EmployService {

	@Autowired
	private EmployRepository repo;
	
	public List<Employ> showEmploy() {
		return repo.findAll();
	}
	
	public String deleteEmploy(int empno) {
		repo.deleteById(empno);
		return "Employ Record Deleted...";
	}
	
	public Employ searchEmploy(int empno) {
		return repo.findById(empno).get();
	}
	
	public String updateEmploy(Employ employ) {
		repo.save(employ);
		return "Employ Record Updated...";
	}
	public String addEmploy(Employ employ) {
		repo.save(employ);
		return "Employ Record Inserted...";
	}
}
