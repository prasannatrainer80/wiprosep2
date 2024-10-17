package com.example.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Users;
import com.example.service.UsersService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class UsersController {

	@Autowired
	private UsersService userService;
	
	@RequestMapping(value="/")
	public ModelAndView home() {
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/addUser")
	public ModelAndView addUser() {
		return new ModelAndView("AddUser");
	}
	
	@RequestMapping(value="/addUserFinal")
	public ModelAndView addUserFinal(HttpServletRequest req) throws ParseException, MessagingException {
		Users user = new  Users();
		user.setFirstName(req.getParameter("firstName"));
		user.setLastName(req.getParameter("lastName"));
		user.setUsername(req.getParameter("userName"));
		user.setPassword(req.getParameter("password"));
		user.setEmail(req.getParameter("email"));
		user.setGender(req.getParameter("gender"));
		user.setPhoneNo(req.getParameter("phoneNo"));
		user.setDomain(req.getParameter("domain"));
		String db = req.getParameter("dateOfBirth");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date utilDate = sdf.parse(db);
		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
		user.setDateOfBirth(sqlDate);
		userService.addUser(user);
		return new ModelAndView("result");
	}
	
	@RequestMapping(value="/userLogin")
	public ModelAndView userLogin() {
		return new ModelAndView("userLogin");
	}
	
	@RequestMapping(value="/logincheck")
	public ModelAndView loginCheck(HttpServletRequest req) {
		String user = req.getParameter("userName");
		String pwd = req.getParameter("passWord");
		int count = userService.userLoginCheck(user, pwd);
		if (count==1) {
			return new ModelAndView("dashboard");
		} else {
			return new ModelAndView("userLogin","message","invalid credentials");
		}
	}
}
