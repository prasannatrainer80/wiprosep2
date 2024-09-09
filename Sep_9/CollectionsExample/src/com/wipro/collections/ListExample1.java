package com.wipro.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample1 {

	public static void main(String[] args) {
		List names = new ArrayList();
		names.add("Mounika");
		names.add("Aditya");
		names.add("Vipul");
		names.add("Lavanya");
		names.add("Muhammed");
		names.add("Kalpana");
		
		System.out.println("Array List Values are  ");
		for (Object object : names) {
			System.out.println(object);
		}
		
		names.add(2, "Jyothi");
		System.out.println("List after adding new Value  ");
		for (Object object : names) {
			System.out.println(object);
		}
		
		names.set(2, "Kshama");
		System.out.println("List after Update Operation  ");
		for (Object object : names) {
			System.out.println(object);
		}
		
		names.remove("Kshama");
		System.out.println("List after remove Operation  ");
		for (Object object : names) {
			System.out.println(object);
		}
	}
}
