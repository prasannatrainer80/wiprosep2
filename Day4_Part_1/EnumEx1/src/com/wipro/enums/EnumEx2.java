package com.wipro.enums;

import java.util.Scanner;

enum Gender {
	MALE, FEMALE
}

public class EnumEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String gen;
		Gender gender=Gender.MALE;
		System.out.println("Enter Gender   ");
		gen = sc.next();
		if (gen.equals("MALE")) {
			gender = Gender.MALE;
		}
		if (gen.equals("FEMALE")) {
			gender = Gender.FEMALE;
		}
		System.out.println("Gender is " +gender);
	}
}
