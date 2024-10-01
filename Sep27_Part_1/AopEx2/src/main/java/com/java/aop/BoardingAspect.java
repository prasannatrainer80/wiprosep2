package com.java.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class BoardingAspect {

	@Pointcut("execution(* com.java.aop.Boarding.*(..)) && args(employ)")
	private void anyAdvice(String employ) {}
	
	@Before("anyAdvice(String)")
	public void informMessage() {
		System.out.println("Please Inform 1 day before...");
	}
	
	@AfterReturning(
			pointcut = "execution(* com.java.aop.Boarding.*(..)) && args(String)",
			returning = "result")
	public void myadvice(JoinPoint jp, Object result) {
		System.out.println("Additional Output");
		System.out.println("Method Signature  " + jp.getSignature());
		System.out.println("Result  " +result);
	}
	
	@Before("anyAdvice(String)")
	public void infoObj() {
		System.out.println("Meeting will be offline/online both modes...");
	}
	
	@After("anyAdvice(String)")
	public void views() {
		System.out.println("Please Collect Feedback...");
	}
}
