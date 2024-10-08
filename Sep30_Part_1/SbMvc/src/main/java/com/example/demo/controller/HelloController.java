package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

	@GetMapping({"/","/hello"})
	public String hello(@RequestParam(value="name", defaultValue = "Hello", required = true) String name, Model model) {
		model.addAttribute("name",name);
		return "hello";
	}
}
