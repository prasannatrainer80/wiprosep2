package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class EmployController {

	@Autowired
	private EmployDao employDao;
	
	@GetMapping(value="/")
	public ModelAndView showEmploy() {
		List<Employ> employList = employDao.showEmploy();
		return new ModelAndView("employshow","employs",employList);
	}
	
	@GetMapping(value="/employConfirm")
	public ModelAndView employConfirm(HttpServletRequest req) {
		Employ employ = new Employ();
		employ.setEmpno(Integer.parseInt(req.getParameter("empno")));
		employ.setName(req.getParameter("name"));
		employ.setGender(req.getParameter("gender"));
		employ.setDept(req.getParameter("dept"));
		employ.setDesig(req.getParameter("desig"));
		employ.setBasic(Double.parseDouble(req.getParameter("basic")));
		String result =employDao.addEmploy(employ);
		return new ModelAndView("redirect:/");
	}
	
	@GetMapping(value="/addEmploy")
	public ModelAndView addEmploy() {
		return new ModelAndView("addEmploy");
	}
	
	@GetMapping(value="/searchShow")
	public ModelAndView searchEmploy(HttpServletRequest req) {
		int empno = Integer.parseInt(req.getParameter("empno"));
		Employ employ = employDao.searchEmploy(empno);
		return new ModelAndView("result","employ",employ);
		
	}
	
	@GetMapping(value="/searchEmploy")
	public ModelAndView searchEmploy() {
		return new ModelAndView("searchEmploy");
	}
}
