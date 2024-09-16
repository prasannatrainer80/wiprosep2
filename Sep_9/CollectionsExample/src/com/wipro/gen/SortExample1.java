package com.wipro.gen;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;


public class SortExample1 {

	public static void main(String[] args) {
//		Comparator<Employ> c = new NameComparator();
		Comparator<Employ> c = new BasicComparator();
		SortedSet<Employ> employs = new TreeSet<Employ>(c);
		employs.add(new Employ(1, "Shyam", 99423.44));
		employs.add(new Employ(2, "Rinka", 88555.44));
		employs.add(new Employ(3, "Khushi", 91144.44));
		employs.add(new Employ(4, "Tarak", 89942.44));
		employs.add(new Employ(5, "Aditya", 87742.44));
		employs.add(new Employ(6, "Archana", 90422.44));
		
		for (Employ employ : employs) {
			System.out.println(employ);
		}
	}
}
