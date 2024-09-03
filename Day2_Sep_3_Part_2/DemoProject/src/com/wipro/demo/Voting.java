package com.wipro.demo;

import java.util.Scanner;

/**
 * Program to check a person is elligible for voting or not
 */

public class Voting {

	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age  ");
		age = sc.nextInt();
		if (age >= 18) {
			System.out.println("You Can Vote...");
		} else {
			System.out.println("Not Authorized for Voting...");
		}
	}
}
