package com.wipro.demo;

import java.util.Scanner;

public class SwitchCaseEx1 {

	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Choice  ");
		choice = sc.nextInt();
		switch(choice) {
		case 1 : 
			System.out.println("Hi I am Ajinkya");
			break;
		case 2 : 
			System.out.println("Hi I am Bhupathi...");
			break;
		case 3 : 
			System.out.println("Hi I am Jyothi...");
			break;
		case 4 : 
			System.out.println("Hi I am Khushi...");
			break;
		case 5 : 
			System.out.println("Hi I am Tarak Prabhu...");
			break;
		default : 
			System.out.println("Invalid Choice...");
			break;
			
		}
	}
}
