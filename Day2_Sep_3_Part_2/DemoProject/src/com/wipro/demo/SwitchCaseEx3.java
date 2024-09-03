package com.wipro.demo;

import java.util.Scanner;

public class SwitchCaseEx3 {

	public static void main(String[] args) {
		String dayName;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Day Name  ");
		dayName = sc.next();
		switch(dayName) {
		case "SUNDAY" : 
			System.out.println("Its Sunday...");
			break;
		case "MONDAY" : 
			System.out.println("Its Monday...");
			break;
		case "TUESDAY" : 
			System.out.println("Its Tuesday...");
			break;
		case "WEDNESDAY" : 
			System.out.println("Its Wednesday...");
			break;
		case "THURSDAY" : 
			System.out.println("Its Thursday...");
			break;
		case "FRIDAY" : 
			System.out.println("Its Friday...");
			break;
		case "SATURDAY" : 
			System.out.println("Its Saturday...");
			break;
		default : 
			System.out.println("Invalid Choice...");
			break;
		}
	}
}
