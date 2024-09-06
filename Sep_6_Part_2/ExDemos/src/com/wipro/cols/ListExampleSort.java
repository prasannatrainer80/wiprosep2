package com.wipro.cols;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExampleSort {

	public static void main(String[] args) {
		List names = new ArrayList();
		names.add("Mounika");
		names.add("Archana");
		names.add("Shyam");
		names.add("Nikhita");
		names.add("Rinka");
		names.add("Lavanya");
		names.add("Tarak Prabhu");
		
		Collections.sort(names);
		System.out.println("Sorted Data ");
		for (Object object : names) {
			System.out.println(object);
		}
	}
}
