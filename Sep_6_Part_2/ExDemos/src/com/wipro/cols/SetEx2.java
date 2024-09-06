package com.wipro.cols;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetEx2 {

	public static void main(String[] args) {
		Set data = new LinkedHashSet();
		data.add("Mounika");
		data.add("Archana");
		data.add("Shyam");
		data.add("Nikhita");
		data.add("Rinka");
		data.add("Mounika");
		data.add("Archana");
		data.add("Shyam");
		data.add("Nikhita");
		data.add("Rinka");
		data.add("Shyam");
		data.add("Nikhita");
		data.add("Rinka");
		data.add("Mounika");
		data.add("Archana");
		data.add("Shyam");
		data.add("Nikhita");
		data.add("Rinka");
		data.add("Mounika");
		data.add("Archana");
		data.add("Nikhita");
		data.add("Rinka");
		data.add("Mounika");
		data.add("Archana");
		System.out.println("Hashset data is");
		for (Object object : data) {
			System.out.println(object);
		}
	}
}
