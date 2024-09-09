package com.wipro.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortExample {

	public static void main(String[] args) {
		List names = new ArrayList();
		names.add("Mounika");
		names.add("Aditya");
		names.add("Vipul");
		names.add("Lavanya");
		names.add("Muhammed");
		names.add("Kalpana");
		names.add("Tarak");
		names.add("Simran");
		
		Collections.sort(names);
		System.out.println("Sorted Data is  ");
		for (Object object : names) {
			System.out.println(object);
		}
	}
}
