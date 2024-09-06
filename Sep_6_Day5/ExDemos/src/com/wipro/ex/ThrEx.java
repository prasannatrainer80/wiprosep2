package com.wipro.ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ThrEx {

	/* parse() method converts string to date */
	
	public void convert(String strDate) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(strDate);
		System.out.println(date);
	}
	public static void main(String[] args) {
		String strDate;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date (yyyy-MM-dd) format ");
		strDate = sc.next();
		ThrEx obj = new ThrEx();
		try {
			obj.convert(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
