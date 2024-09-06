package com.wipro.ex;

import java.util.Scanner;

public class EnumEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String gen;
		System.out.println("Enter Gender (MALE/FEMALE)  ");
		gen = sc.next();
		try {
			Gender gender = Gender.valueOf(gen);
			System.out.println("Enum is " +gender);
		} catch (IllegalArgumentException e) {
			System.err.println("No Enum Data Exists with Value Specified...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
