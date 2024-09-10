package com.wipro.files;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutEx1 {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("c:/files/data.txt");
			DataOutputStream dout = new DataOutputStream(fout);
			dout.writeInt(83);
			dout.writeUTF("Wipro");
			dout.writeDouble(99924.34);
			dout.writeBoolean(true);
			dout.close();
			fout.close();
			System.out.println("*** File Created ***");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
