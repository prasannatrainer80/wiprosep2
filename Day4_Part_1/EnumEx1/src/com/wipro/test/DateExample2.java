package com.wipro.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample2 {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(date));
		sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss:ms");
		System.out.println(sdf.format(date));
	}
}
