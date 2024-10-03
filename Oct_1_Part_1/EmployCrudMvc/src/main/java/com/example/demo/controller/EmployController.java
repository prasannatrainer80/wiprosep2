package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.models.Employ;
import com.example.demo.service.EmployService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class EmployController {

	@Autowired
	private EmployService service;
	
	@GetMapping("/")
	public ModelAndView showEmployDao() {
		List<Employ> employList = service.showEmploy();
		return new ModelAndView("home","employList",employList);
	}
	
	@GetMapping(value="/addEmploy")
	public ModelAndView add() {
		return new ModelAndView("addEmploy");
	}
	@GetMapping(value="/addEmployFinal")
	public ModelAndView addEmploy(HttpServletRequest req) {
		Employ employ = new Employ();
		employ.setEmpno(Integer.parseInt(req.getParameter("empno")));
		employ.setName(req.getParameter("name"));
		employ.setGender(req.getParameter("gender"));
		employ.setDept(req.getParameter("dept"));
		employ.setDesig(req.getParameter("desig"));
		employ.setBasic(Double.parseDouble(req.getParameter("basic")));
		service.addEmploy(employ);
		return new ModelAndView("redirect:/");
	}
	
	@GetMapping(value="/deleteEmploy")
	public ModelAndView deleteEmploy(HttpServletRequest request) {
		int empno = Integer.parseInt(request.getParameter("empno"));
		service.deleteEmploy(empno);
		return new ModelAndView("redirect:/");
	}
	
	@GetMapping(value="/updateEmploy")
	public ModelAndView searchEmploy(HttpServletRequest request) {
		int empno = Integer.parseInt(request.getParameter("empno"));
		Employ employ = service.searchEmploy(empno);
		System.out.println(employ);
		return new ModelAndView("updateEmploy","employ",employ);
	}
	
	@GetMapping(value="/updateFinal")
	public ModelAndView updateEmploy(HttpServletRequest req) {
		Employ employ = new Employ();
		employ.setEmpno(Integer.parseInt(req.getParameter("empno")));
		employ.setName(req.getParameter("name"));
		employ.setGender(req.getParameter("gender"));
		employ.setDept(req.getParameter("dept"));
		employ.setDesig(req.getParameter("desig"));
		employ.setBasic(Double.parseDouble(req.getParameter("basic")));
		service.update(employ);
		return new ModelAndView("redirect:/");
	}
}
