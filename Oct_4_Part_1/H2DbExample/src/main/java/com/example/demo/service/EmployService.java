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
	
	public List<Employ> showEmployDao() {
		return repo.findAll();
	}
	
	public Employ searchEmployDao(int empno) {
		return repo.findById(empno).get();
	}
	
	public String addEmployDao(Employ employ) {
		repo.save(employ);
		return "Employ Record Inserted...";
	}
	
	public String updateEmployDao(Employ employ) {
		repo.save(employ);
		return "Employ Record Updated...";
	}
	
	public String deleteEmployDao(int empno) {
		repo.deleteById(empno);
		return "Employ Record Deleted...";
	}
}
