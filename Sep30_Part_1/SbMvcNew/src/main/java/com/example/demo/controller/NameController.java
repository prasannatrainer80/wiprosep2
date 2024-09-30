package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class NameController {

	@GetMapping(value="/")
	public String defaultPage() {
		return "home";
	}
	
	@GetMapping(value="/result")
	public ModelAndView show(HttpServletRequest req) {
		String sname = req.getParameter("sname");
		return new ModelAndView("result","sname",sname);
	}
}
