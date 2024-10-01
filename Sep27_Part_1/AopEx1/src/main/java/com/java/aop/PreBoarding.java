package com.java.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PreBoarding {

	@Pointcut("execution(* com.java.aop.Boarding.*(..))")
	public void test() {}
	
	@Before("test()")
	public void idCard() {
		System.out.println("Id card to Employ to be Given...");
	}
	
	@Before("test()")
	public void laptop() {
		System.out.println("Laptop to be Provided...");
	}
	
	@After("test()")
	public void cubical() {
		System.out.println("Assgin cubical on floor...");
	}
	
	@After("test()")
	public void timeSheet() {
		System.out.println("Need to fill TimeSheet for Billing...");
	}
	
	@AfterReturning(
			pointcut = "execution(* com.java.aop.Boarding.*(..))",
			returning = "result")
	public void myadvice(JoinPoint jp, Object result) {
		System.out.println("Additional Output");
		System.out.println("Method Signature  " + jp.getSignature());
		System.out.println("Result  " +result);
	}

}
