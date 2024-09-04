package com.wipro.conex;

public class StaticEx2 {

	static int count;
	public void increment() {
		count++;
	}
	
	public void show() {
		System.out.println("Count is  " +count);
	}
	
	public static void main(String[] args) {
		StaticEx2 obj1 = new StaticEx2();
		StaticEx2 obj2 = new StaticEx2();
		
		obj1.increment();
		obj2.increment();
		
		obj1.show();
		obj2.show();
	}
}
