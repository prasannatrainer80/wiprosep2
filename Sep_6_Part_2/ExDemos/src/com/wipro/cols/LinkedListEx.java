package com.wipro.cols;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList data = new LinkedList();
		data.add("Mounika");
		data.add("Archana");
		data.add("Shyam");
		data.add("Nikhita");
		data.add("Rinka");
		data.addFirst("Prasanna");
		data.addLast("Anil");
		System.out.println("Linked List Data  ");
		for (Object object : data) {
			System.out.println(object);
		}
	}
}
