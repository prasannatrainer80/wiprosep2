package com.wipro.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ShowTime {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss:ms");
		System.out.println(sdf.format(date));
	}
}
