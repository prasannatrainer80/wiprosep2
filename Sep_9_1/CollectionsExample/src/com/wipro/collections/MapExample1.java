package com.wipro.collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapExample1 {

	public static void main(String[] args) {
		Map data = new Hashtable();
		data.put(1, "Nikhita");
		data.put(2, "Subbarayudu");
		data.put(3, "Raja");
		data.put(4, "Vipul");
		data.put(5, "Shyam");
		data.put(6, "Taraka");
		
		int key;
		String value;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Key  ");
		key = sc.nextInt();
		value = (String)data.getOrDefault(key, "Not Found");
		System.out.println(value);
	}
}
