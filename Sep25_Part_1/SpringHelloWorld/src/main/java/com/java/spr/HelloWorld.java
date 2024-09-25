package com.java.spr;

public class HelloWorld {

	private String greeting;

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	public String sayHello(String name) {
		return greeting+name;
	}
}
