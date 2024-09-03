package com.wipro.demo;

public class Quiz10 {

	int n;
	public static void main(String[] args) {
		Quiz10 obj1 = new Quiz10();
		obj1.n = 12;
		Quiz10 obj2 = obj1;
		obj2.n = 13;
		System.out.println(obj1.n);
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}
}
