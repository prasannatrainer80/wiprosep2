package com.wipro.gen;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class UserAuthEx {

	public static void main(String[] args) {
		Map<String, String> userData = new Hashtable<String, String>();
		userData.put("Ajinkya", "Mohite");
		userData.put("Deepthi", "Kollu");
		userData.put("Lavanya", "Allu");
		userData.put("Muhammed", "Abdur");
		userData.put("Subba", "Rayudu");
		userData.put("Vipul", "Magdum");
		
		Scanner sc = new Scanner(System.in);
		String key;
		String pwd;
		String res;
		System.out.println("Enter UserName and Password  ");
		key = sc.next();
		pwd = sc.next();
		res = userData.getOrDefault(key, "Not Found");
		if (pwd.equals(res)) {
			System.out.println("Correct Credentials...");
		} else {
			System.out.println("Invalid Credentials...");
		}
	}
}
