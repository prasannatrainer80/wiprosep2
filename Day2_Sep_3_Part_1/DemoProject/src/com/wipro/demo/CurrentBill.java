package com.wipro.demo;

import java.util.Scanner;

public class CurrentBill {

	public static void main(String[] args) {
		int units;
		double price, totalBill=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No.of Units   ");
		units = sc.nextInt();
		if (units <= 90) {
			price = 1;
			totalBill = price * units;
		}
		
		if (units > 90) {
			totalBill = totalBill + 90;
			price = 1.5;
			if (units - 150 > 0) {
				totalBill+= (60 * price); 
			} else {
				totalBill+= price * (units - 90);
			}
		}
		
		if (units > 150) {
			price = 2;
			if (units - 200 > 0) {
				totalBill += price * 50;
			} else {
				totalBill += (units - 150) * price;
			}
		}
		
		System.out.println("Total Current Bill   " +totalBill);
	}
}
