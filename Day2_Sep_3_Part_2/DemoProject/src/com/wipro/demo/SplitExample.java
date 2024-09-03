package com.wipro.demo;

public class SplitExample {

	public static void main(String[] args) {
		String str="Raja,Parameshwar,Simran,Soma,Usha,Taraka,Vipul,Aditya,Lavanya";
		String[] names = str.split(",");
		for (String s : names) {
			System.out.println(s);
		}
	}
}
