package com.wipro.boxing;

public class OverloadEx2 {

	public int sum() {
		return 5;
	}
	
	public int sum(int x) {
		return x + 5;
	}
	
	public int sum(int x, int y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		OverloadEx2 obj = new OverloadEx2();
		int res = obj.sum();
		System.out.println("Result is  " +res);
		res = obj.sum(12);
		System.out.println("Result is " +res);
		res = obj.sum(15, 55);
		System.out.println("Result is  " +res);
	}
}
