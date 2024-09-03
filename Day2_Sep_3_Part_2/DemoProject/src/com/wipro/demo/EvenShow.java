package com.wipro.demo;

import java.util.Scanner;

public class EvenShow {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number  ");
		n = sc.nextInt();
		int i=0;
		while(i < n) {
			i = i+2;
			System.out.println("Even " +i);
		}
	}
}
