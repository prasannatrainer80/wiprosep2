package com.wipro.gen;

import java.util.ArrayList;
import java.util.List;

public class ListExample2 {

	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Archana", 99234.22));
		employList.add(new Employ(2, "Deepthi", 90032.22));
		employList.add(new Employ(3, "Vipul", 88422.22));
		employList.add(new Employ(4, "Taraka", 89022.22));
		System.out.println("Employ List is  ");
		for (Employ employ : employList) {
			System.out.println(employ);
		}
	}
}
