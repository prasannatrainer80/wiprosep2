package com.wipro.collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortStudent {

	public static void main(String[] args) {
		Comparator c = new NameSortComparator();
		SortedSet students = new TreeSet(c);
		students.add(new Student(1, "Archana", "Hyderabad", 9.3));
		students.add(new Student(2, "Simran", "Delhi", 8.9));
		students.add(new Student(3, "Ajinkya", "Chennai", 9.1));
		students.add(new Student(4, "Mounika", "Bangalore", 8.8));
		students.add(new Student(5, "Lavanya", "Hyderabad", 9.7));
		students.add(new Student(6, "Nikhitha", "Chennai", 8.7));
		students.add(new Student(7, "Srujan", "Pune", 9.2));
		
		System.out.println("Students are ");
		for (Object object : students) {
			Student student = (Student)object;
			System.out.println(student);
		}
		
	}
}
