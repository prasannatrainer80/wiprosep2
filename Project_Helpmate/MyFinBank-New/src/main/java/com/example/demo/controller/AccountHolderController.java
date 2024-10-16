package com.example.demo.controller;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.AccountHolder;
import com.example.demo.service.AccountHolderService;

import jakarta.servlet.http.HttpServletRequest;

//import com.example.demo.service.AccountHolderService;

@Controller
public class AccountHolderController {

	@Autowired
	private AccountHolderService accountHolderService;
	
	@RequestMapping(value="/")
	public ModelAndView defaultPage() {
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/createAccount")
	public ModelAndView createAccount() {
		return new ModelAndView("createAccount");
	}
	
	@RequestMapping(value="/createFinal")
	public ModelAndView createFinal(HttpServletRequest req) throws MessagingException {
		AccountHolder accountHolder = new AccountHolder();
		accountHolder.setFirstName(req.getParameter("firstName"));
		accountHolder.setLastName(req.getParameter("lastName"));
		accountHolder.setCity(req.getParameter("city"));
		accountHolder.setState(req.getParameter("state"));
		accountHolder.setGender(req.getParameter("gender"));
		accountHolder.setAmount(Double.parseDouble(req.getParameter("amount")));
		accountHolder.setEmail(req.getParameter("email"));
		accountHolder.setMobileNo(req.getParameter("mobileNo"));
		accountHolder.setUserName(req.getParameter("userName"));
		accountHolder.setPassWord(req.getParameter("passWord"));
		accountHolder.setCheqFacil(req.getParameter("cheqFacil"));
		accountHolder.setAccountType(req.getParameter("accountType"));
		accountHolderService.saveAccountHolder(accountHolder);
		return new ModelAndView("result");
	}
}
