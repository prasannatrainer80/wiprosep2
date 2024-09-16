package com.wipro.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortExample1 {

	public static void main(String[] args) {
		SortedSet names = new TreeSet();
		names.add("Mounika");
		names.add("Aditya");
		names.add("Vipul");
		names.add("Lavanya");
		names.add("Muhammed");
		names.add("Kalpana");
		names.add("Tarak");
		names.add("Simran");
		
		System.out.println("Sorted List is  ");
		for (Object object : names) {
			System.out.println(object);
		}
	}
}
