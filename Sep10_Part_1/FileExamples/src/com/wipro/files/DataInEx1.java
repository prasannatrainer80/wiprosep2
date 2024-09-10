package com.wipro.files;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInEx1 {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("C:/files/data.txt");
			DataInputStream din = new DataInputStream(fin);
			int x = din.readInt();
			String str = din.readUTF();
			double bas = din.readDouble();
			boolean flag = din.readBoolean();
			System.out.println("X value  " +x);
			System.out.println("String Value  " +str);
			System.out.println("Boolean Value  " +flag);
			System.out.println("Basic Value  " +bas);
			din.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
