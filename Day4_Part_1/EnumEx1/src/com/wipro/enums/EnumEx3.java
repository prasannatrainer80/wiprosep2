package com.wipro.enums;

import java.util.Scanner;

enum OrderStus {
	PENDING, ACCEPTED, REJECTED
}

public class EnumEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Order Status (PENDING/ACCEPTED/REJECTED)  ");
		String status = sc.next();
		OrderStus orderStatus = OrderStus.valueOf(status);
		System.out.println(orderStatus);
		
//		String str="12";
//		int x = Integer.valueOf(str);
//		System.out.println(x);
	}
}
