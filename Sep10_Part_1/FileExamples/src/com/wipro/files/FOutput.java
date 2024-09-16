package com.wipro.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOutput {

	public static void main(String[] args) {
		try {
			FileInputStream src = 
					new FileInputStream("C:/java_wipro/Cols/CollectionsExample/src/com/wipro/lamb/Employ.java");
			FileOutputStream out = 
					new FileOutputStream("c:/files/Demo.java");
			int ch;
			while((ch=src.read()) != -1) {
				out.write((char)ch);
			}
			src.close();
			out.close();
			System.out.println("File Created...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
