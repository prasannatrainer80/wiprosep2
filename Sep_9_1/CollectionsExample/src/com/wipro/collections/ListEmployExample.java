package com.wipro.collections;

import java.util.ArrayList;
import java.util.List;

public class ListEmployExample {

	public static void main(String[] args) {
		List employList = new ArrayList();
		employList.add(new Employ(1, "Shyam", 99423.44));
		employList.add(new Employ(2, "Rinka", 88555.44));
		employList.add(new Employ(3, "Khushi", 91144.44));
		employList.add(new Employ(4, "Tarak", 89942.44));
		employList.add(new Employ(5, "Aditya", 87742.44));
		employList.add(new Employ(6, "Archana", 90422.44));
		
		for (Object object : employList) {
			Employ employ = (Employ)object;
			System.out.println(employ);
		}
		
	}
}
