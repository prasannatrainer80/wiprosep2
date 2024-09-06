package com.wipro.cols;

import java.util.ArrayList;
import java.util.List;

public class ListExample1 {

	public static void main(String[] args) {
		List names = new ArrayList();
		names.add("Mounika");
		names.add("Archana");
		names.add("Shyam");
		names.add("Nikhita");
		names.add("Rinka");
		System.out.println("Names are  ");
		for (Object ob : names) {
			System.out.println(ob);
		}
		names.add(2, "Vipul");
		System.out.println("Names after Insert Operation  ");
		for (Object object : names) {
			System.out.println(object);
		}
		
		names.set(2, "Lavanya");
		System.out.println("After Update  ");
		for (Object object : names) {
			System.out.println(object);
		}
		
		names.remove("Lavanya");
		System.out.println("List after Removing...");
		for (Object object : names) {
			System.out.println(object);
		}
	}
}
