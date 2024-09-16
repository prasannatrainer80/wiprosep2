package com.wipro.gen;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapExample1 {

	public static void main(String[] args) {
		Map<Integer, String> data = new Hashtable<Integer, String>();
		data.put(1, "Nikhita");
		data.put(2, "Subbarayudu");
		data.put(3, "Raja");
		data.put(4, "Vipul");
		data.put(5, "Shyam");
		data.put(6, "Taraka");
//		data.put("hello", "Hello");
		Scanner sc = new Scanner(System.in);
		int key;
		String name;
		System.out.println("Enter Key  ");
		key = sc.nextInt();
		name = data.getOrDefault(key, "Not Found");
		System.out.println(name);
	}
}
