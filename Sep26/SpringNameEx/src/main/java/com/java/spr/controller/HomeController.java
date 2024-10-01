package com.java.spr.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/nameshow")
	public ModelAndView show(HttpServletRequest req) {
		String fname = req.getParameter("firstName");
		String lname = req.getParameter("lastName");
		String fullName = fname + " " +lname;
		return new ModelAndView("show","fullName",fullName);
	}
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
}
