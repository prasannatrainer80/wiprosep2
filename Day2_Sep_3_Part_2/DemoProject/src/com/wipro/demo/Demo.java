package com.wipro.demo;

class Data {
	public void sayHello() {
		System.out.println("Welcome to Java...");
	}
	
	private void trainer() {
		System.out.println("Trainer is Prasanna...");
	}
	
	void company() {
		System.out.println("Company is Wipro...");
	}
}

public class Demo {

	public static void main(String[] args) {
		Data obj = new Data();
		obj.company();
		obj.sayHello();
	}
}
