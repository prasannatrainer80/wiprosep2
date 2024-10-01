package com.java.aop;

public class Meeting {

	public void agenda() {
		System.out.println("Meeting about Plan and current ongoing progres...");
	}
	
	public void views() {
		System.out.println("Taking Your Views...");
	}
	
	public void show(String name) {
		System.out.println("Participant Name is " +name);
	}
}
