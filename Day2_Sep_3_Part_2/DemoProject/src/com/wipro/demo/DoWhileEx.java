package com.wipro.demo;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N value  ");
		n = sc.nextInt();
		int f = 1;
		do {
			f = f * n;
			n--;
		} while (n!=0);
		System.out.println("Factorial Value is  " +f);
	}
}
