package com.java.mvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/login")
	public ModelAndView login() {
		return new ModelAndView("login");
	}
	@RequestMapping(value="/validate")
	public ModelAndView auth(HttpServletRequest req) {
		String user = req.getParameter("userName");
		String pwd = req.getParameter("passWord");
		if (user.equals("Wipro") && pwd.equals("Wipro")) {
			return new ModelAndView("success");
		} else {
			return new ModelAndView("error");
		}
	}
	@RequestMapping(value="/calc")
	public ModelAndView calc(HttpServletRequest req) {
		int fno = Integer.parseInt(req.getParameter("firstNo"));
		int sno = Integer.parseInt(req.getParameter("secondNo"));
		int res = fno + sno;
		return new ModelAndView("show","result", res);
	}
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
}
