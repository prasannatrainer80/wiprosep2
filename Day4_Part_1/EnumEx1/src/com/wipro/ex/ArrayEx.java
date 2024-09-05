package com.wipro.ex;

public class ArrayEx {

	public static void main(String[] args) {
		int[] a = new int[] {12,5};
		try {
			a[10] = 88;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Size is Small...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
