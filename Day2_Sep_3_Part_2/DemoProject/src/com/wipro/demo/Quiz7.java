package com.wipro.demo;

public class Quiz7 {

	public static void main(String[] args) {
		boolean flag;
		int x = 3;
		flag = (x > 2 && x == 3);
		System.out.println(flag);
		flag = (x > 3 || x < 5);
		System.out.println(flag);
		int y = ~x;
		System.out.println(y);
		x = -10;
		System.out.println(~x);
		x = 6;
		System.out.println(~x);
	}
}
