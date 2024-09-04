package com.wipro.boxing;

public class BoxingExample {

	public static void main(String[] args) {
		
		int a=12;
		double b=12.5;
		String str="Wipro";
		
		/* implement Boxing */
		Object ob1 = a;
		Object ob2 = b;
		Object ob3 = str;
		
		/* Implementing Unboxing */
		int a1 = (Integer)ob1;
		double b1 = (Double)ob2;
		String s1 = (String)ob3;
		
		System.out.println("A1 value  " +a1);
		System.out.println("B1 Value  " +b1);
		System.out.println("String Value  " +s1);
	}
}
