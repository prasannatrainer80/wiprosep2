package com.wipro.demo;

import java.util.Scanner;

public class Max3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter 3 Numbers   ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int m = a;
		if (m < b) {
			m = b;
		}
		if (m < c) {
			m = c;
		}
		System.out.println("Max Value  " +m);
	}
}
