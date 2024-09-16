package com.wipro.lamb;

import java.util.Scanner;

@FunctionalInterface
interface ICalculation {
	int calc(int a, int b);
}

public class LambdaExpr2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, res;
		System.out.println("Enter 2 Numbers   ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		ICalculation obj1 = (x, y) -> {
			return x+y;
		};
		System.out.println("Sum is  " +obj1.calc(a, b));
		
		ICalculation obj2 = (x, y) -> {
			return x - y;
		};
		System.out.println("Sub is  "+obj2.calc(a, b));
		ICalculation obj3 = (x, y) -> {
			return x * y;
		};
		System.out.println("Mult is  " +obj3.calc(a, b));
	}
}
