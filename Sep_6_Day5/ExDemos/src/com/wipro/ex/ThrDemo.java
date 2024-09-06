package com.wipro.ex;

import java.util.Scanner;

public class ThrDemo {

	public void show(int n) {
		if (n < 0) {
			throw new ArithmeticException("Negative Nos Not Allowed...");
		} else if (n ==0) {
			throw new ArrayIndexOutOfBoundsException("Zero is Invalid Value...");
		} else {
			System.out.println("N value is  " +n);
		}
	}
	
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number  ");
		n = sc.nextInt();
		ThrDemo obj = new ThrDemo();
		try {
			obj.show(n);
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
