package com.wipro.demo;

import java.util.Scanner;

/**
 * Program to check given number is even or Odd
 */

public class EvenOdd {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N value  ");
		n = sc.nextInt();
		if (n%2==0) {
			System.out.println("Even Number...");
		} else {
			System.out.println("Odd Number...");
		}
	}
}
