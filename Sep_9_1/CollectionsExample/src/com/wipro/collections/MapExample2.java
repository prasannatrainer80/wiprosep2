package com.wipro.collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapExample2 {

	public static void main(String[] args) {
		Map userData = new Hashtable();
		userData.put("Ajinkya", "Mohite");
		userData.put("Deepthi", "Kollu");
		userData.put("Lavanya", "Allu");
		userData.put("Muhammed", "Abdur");
		userData.put("Subba", "Rayudu");
		userData.put("Vipul", "Magdum");
		
		Scanner sc = new Scanner(System.in);
		String user, pwd;
		System.out.println("Enter UserName and Password  ");
		user = sc.next();
		pwd = sc.next();
		
		String res = (String)userData.getOrDefault(user, "Not Found");
		if (pwd.equals(res)) {
			System.out.println("Correct Credentials...");
		} else {
			System.out.println("Invalid Credentials...");
		}
	}
}
