package com.wipro.p1;

public class Demo {

	private String privateGreeting="Hello";
	public String publicGreeting="Hi";
	protected String protectedGreeting = "Test";
	String friendlyGreeting = "Friend";
	
	public void show() {
		System.out.println("Private  " +privateGreeting);
		System.out.println("Public  " +publicGreeting);
		System.out.println("Protected  " +protectedGreeting);
		System.out.println("Friendly " +friendlyGreeting);
	}
}
