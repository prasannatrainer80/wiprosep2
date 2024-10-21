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

import com.example.demo.model.Menu;
import com.example.demo.repo.MenuRepository;

@RestController
@RequestMapping(value="pizza/menu")
public class MenuController {

	@Autowired
	private MenuRepository repository;
	
	@GetMapping(value="/showMenu")
	public List<Menu> showMenu() {
		return repository.findAll();
	}
	
	@GetMapping(value="/searchMenu/{id}")
	public Menu searchById(@PathVariable int id) {
		return repository.findById(id).get();
	}
	
	@PostMapping(value="/addMenu")
	public String addMenu(@RequestBody Menu menu) {
		repository.save(menu);
		return "Menu Added...";
	}
	
	@DeleteMapping(value="/deleteMenu/{id}")
	public String deleteMenu(@PathVariable int id) {
		repository.deleteById(id);
		return "Record Deleted...";
	}
	
	@PutMapping(value="/updateMenu")
	public String updateMenu(@RequestBody Menu menu) {
		repository.save(menu);
		return "Menu Updated...";
	}
}
