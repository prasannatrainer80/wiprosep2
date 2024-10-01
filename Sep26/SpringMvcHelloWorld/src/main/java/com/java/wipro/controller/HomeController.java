package com.java.wipro.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/subbrayudu")
	public ModelAndView subba() {
		return new ModelAndView("subbu");
	}
	@RequestMapping(value="/archana")
	public ModelAndView archanaPage() {
		return new ModelAndView("archana");
	}
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
}
