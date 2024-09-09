package com.wipro.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {

	public static void main(String[] args) {
//		Comparator c = new NameComparator();
		Comparator c = new BasicComparator();
		SortedSet employList = new TreeSet(c);
		employList.add(new Employ(1, "Shyam", 99423.44));
		employList.add(new Employ(2, "Rinka", 88555.44));
		employList.add(new Employ(3, "Khushi", 91144.44));
		employList.add(new Employ(4, "Tarak", 89942.44));
		employList.add(new Employ(8, "Mounika", 88322.44));
		employList.add(new Employ(9, "Subbarayudu", 90033.44));
		employList.add(new Employ(5, "Aditya", 87742.44));
		employList.add(new Employ(6, "Archana", 90422.44));
		
		for (Object object : employList) {
			Employ employ = (Employ)object;
			System.out.println(employ);
		}
	}
}
