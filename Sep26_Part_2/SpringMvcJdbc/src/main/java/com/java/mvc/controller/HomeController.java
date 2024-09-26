package com.java.mvc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.mvc.dao.EmployDao;
import com.java.mvc.model.Employ;

@Controller
public class HomeController {

	@Autowired
	private EmployDao employDao;
	
	@RequestMapping(value="/deleteEmploy")
	public ModelAndView deleteEmploy(HttpServletRequest req) {
		int empno = Integer.parseInt(req.getParameter("empno"));
		employDao.deleteEmploy(empno);
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value="/addEmploy")
	public ModelAndView add() {
		return new ModelAndView("addEmploy");
	}
	
	@RequestMapping(value="/addConfirm")
	public ModelAndView addConfirm(HttpServletRequest req) {
		Employ employ = new Employ();
		employ.setEmpno(Integer.parseInt(req.getParameter("empno")));
		employ.setName(req.getParameter("name"));
		employ.setGender(req.getParameter("gender"));
		employ.setDept(req.getParameter("dept"));
		employ.setDesig(req.getParameter("desig"));
		employ.setBasic(Double.parseDouble(req.getParameter("basic")));
		employDao.addEmploy(employ);
		return new ModelAndView("redirect:/");
	}
	@RequestMapping(value="/updateConfirm")
	public ModelAndView updateConfirm(HttpServletRequest req) {
		Employ employ = new Employ();
		employ.setEmpno(Integer.parseInt(req.getParameter("empno")));
		employ.setName(req.getParameter("name"));
		employ.setGender(req.getParameter("gender"));
		employ.setDept(req.getParameter("dept"));
		employ.setDesig(req.getParameter("desig"));
		employ.setBasic(Double.parseDouble(req.getParameter("basic")));
		employDao.updateEmploy(employ);
		return new ModelAndView("redirect:/");
	}
	@RequestMapping(value="/updateEmploy")
	public ModelAndView show(HttpServletRequest req) {
		int empno = Integer.parseInt(req.getParameter("empno"));
		Employ employ = employDao.searchEmploy(empno);
		return new ModelAndView("updateEmploy","employ",employ);
	}
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		List<Employ> employList = employDao.showEmployDao();
		return new ModelAndView("home","employList",employList);
	}
}
