package com.wipro.demo;

import java.util.Scanner;

/**
 * Program to Check given number is positive or negative
 */
public class PosNeg {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number  ");
		n = sc.nextInt();
		if (n >= 0) {
			System.out.println("Positive No...");
		} else {
			System.out.println("Negative No...");
		}
	}
}
