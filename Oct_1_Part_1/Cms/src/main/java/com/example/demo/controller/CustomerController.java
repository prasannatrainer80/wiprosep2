package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping(value="/")
	public ModelAndView login() {
		return new ModelAndView("CustomerLogin");
	}
	
	@GetMapping(value="/customerShow")
	public ModelAndView customerShow() {
		List<Customer> customers = customerService.showCustomer();
		return new ModelAndView("CustomerShow", "customers",customers);
	}
	
	@GetMapping(value="/customerLogin")
	public ModelAndView auth(HttpServletRequest req) {
		String user, pwd;
		user = req.getParameter("userName");
		pwd = req.getParameter("passWord");
		int count = customerService.login(user, pwd);
		if (count==1) {
			return new ModelAndView("DashBoard");
		} else {
			return new ModelAndView("CustomerLogin","error","Invalid Credentials...");
		}
	}
}
