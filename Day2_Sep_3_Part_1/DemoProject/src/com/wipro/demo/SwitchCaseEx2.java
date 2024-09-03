package com.wipro.demo;

import java.util.Scanner;

public class SwitchCaseEx2 {

	public static void main(String[] args) {
		String choice;
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter 2 Numbers  ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Enter your Choice (+, -, *, /) ");
		choice = sc.next();
		switch(choice) {
		case "+" : 
			c = a + b;
			System.out.println("Sum is  " +c);
			break;
		case "-" : 
			c = a - b;
			System.out.println("Sub is  " +c);
			break;
		case "*" : 
			c = a * b;
			System.out.println("Mult is  " +c);
			break;
		case "/" : 
			c = a / b;
			System.out.println("Division is  " +c);
			break;
		}
	}
}
