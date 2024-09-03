package com.wipro.demo;

public class ArrayExample1 {

	public static void main(String[] args) {
		int[] a = new int[] {12,55,22,66,23};
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		
		for (int i : a) {
			System.out.println(i);
		}
	}
}
