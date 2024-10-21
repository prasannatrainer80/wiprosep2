package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Admin;
import com.example.demo.repo.AdminRepository;
import com.example.demo.repo.EncryptPassword;
import com.example.demo.service.AdminService;

@RestController
@RequestMapping(value="/pizza/admin")
public class AdminController {

	@Autowired
	private AdminRepository repository;
	
	@Autowired
	private AdminService adminService;
	
	@PostMapping(value="/addAdmin")
	public String addAdmin(@RequestBody Admin admin) {
		String encr = EncryptPassword.getCode(admin.getAdminPassword());
		admin.setAdminPassword(encr);
		repository.save(admin);
		return "Admin Record Inserted...";
	}
	
	@GetMapping(value="/adminLogin/{user}/{password}")
	public long login(@PathVariable String user, @PathVariable String password) {
		long count = adminService.count(user, password);
		return count;
	}
	
}
