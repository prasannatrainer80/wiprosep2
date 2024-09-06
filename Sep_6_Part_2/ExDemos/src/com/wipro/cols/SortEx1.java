package com.wipro.cols;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortEx1 {

	public static void main(String[] args) {
		SortedSet data = new TreeSet();
		data.add("Mounika");
		data.add("Archana");
		data.add("Shyam");
		data.add("Kshama");
		data.add("Nikhita");
		data.add("Rinka");
		data.add("Jyothi");
		data.add("Aditya");
		data.add("Deepthi");
		data.add("Khushi");
		
		System.out.println("Sorted Data  ");
		for (Object object : data) {
			System.out.println(object);
		}
	}
}
