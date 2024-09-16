package com.wipro.gen;

import java.util.ArrayList;
import java.util.List;

public class ListExample1 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Archana");
		names.add("Mounika");
		names.add("Deepthi");
		names.add("Muhammad");
		System.out.println("Names are ");
		for (String string : names) {
			System.out.println(string);
		}
//		names.add(12);
	}
}
