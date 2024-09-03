package com.wipro.demo;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		int n;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N value   ");
		n = sc.nextInt();
		for(int i=2;i<n;i++) {
			if (n%i==0) {
				flag = false;
				break;
			}
		}
		if (flag==true) {
			System.out.println("Prime Number...");
		} else {
			System.out.println("Not Prime Number...");
		}
	}
}
