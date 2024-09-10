package com.wipro.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScanFile {

	public static void main(String[] args) {
		try {
			FileInputStream fin = 
					new FileInputStream("C:/java_wipro/Cols/CollectionsExample/src/com/wipro/lamb/Employ.java");
			Scanner sc = new Scanner(fin);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
