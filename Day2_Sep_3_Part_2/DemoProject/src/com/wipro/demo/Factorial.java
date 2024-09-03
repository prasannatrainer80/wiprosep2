package com.wipro.demo;

import java.util.Scanner;

/**
 * Program to Display Factorial of given number
 */

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter N value  ");
		n = sc.nextInt();
		int f = 1;
		int i =1;
		while(i<=n) {
			f = f * i;
			i++;
		}
		System.out.println("Factorial Value  " +f);
	}
}
