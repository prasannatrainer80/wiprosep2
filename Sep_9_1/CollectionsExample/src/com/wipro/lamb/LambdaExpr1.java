package com.wipro.lamb;

interface IGreeting {
	void sayHello();
}


public class LambdaExpr1 {

	public static void main(String[] args) {
		IGreeting obj1 = () -> {
			System.out.println("Welcome to Lambda Expression...");
		};
		
		IGreeting obj2 = () -> {
			System.out.println("From Java Trainining...");
		};
		
		IGreeting obj3 = () -> {
			System.out.println("From Trainer Prasanna...");
		};
		
		obj1.sayHello();
		obj2.sayHello();
		obj3.sayHello();
	}
}
