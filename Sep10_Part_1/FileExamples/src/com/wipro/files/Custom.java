package com.wipro.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Custom {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Name  ");
		try {
			String str = br.readLine();
			System.out.println("Name is " +str);
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
