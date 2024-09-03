package com.wipro.demo;

public class StrExamples {

	public static void main(String[] args) {
		String str = "Welcome to Java Training...Trainer Prasanna from Wipro...";
		System.out.println("Length of String  " +str.length());
		System.out.println("First Occurrence of char 'o' is  " +str.indexOf("o"));
		System.out.println("Char at 5th position  " +str.charAt(5));
		System.out.println("Upper Case String is  " +str.toUpperCase());
		System.out.println("Lower Case String is  " +str.toLowerCase());
		String s1="Raja", s2="Simran", s3="Raja";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println("Part of String  " +str.substring(0, 15));
		System.out.println("Replaced String is  " +str.replace("Java", "Angular"));
	}
}
