package com.wipro.testing;

public class Demo {

	public String sayHello() {
		return "Welcome to Junit 5...";
	}
	
	public int sum(int a, int b) {
		return a + b;
	}
	
	public int power(int x) {
		return x * x;
	}
	
	public int max3(int a, int b, int c) {
		int m = a;
		if (m < b) {
			m = b;
		}
		if (m < c) {
			m = c;
		}
		return m;
	}
}
