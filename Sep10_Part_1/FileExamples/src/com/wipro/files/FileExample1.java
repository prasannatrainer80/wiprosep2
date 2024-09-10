package com.wipro.files;

import java.io.File;

public class FileExample1 {

	public static void main(String[] args) {
		File f1 = new File("C:/java_wipro/Cols/CollectionsExample/src/com/wipro/lamb/Employ.java");
		System.out.println("Name of the File  " +f1.getName());
		System.out.println("Path of File  " +f1.getPath());
		System.out.println("Parent Directory  " +f1.getParent());
	}
}
