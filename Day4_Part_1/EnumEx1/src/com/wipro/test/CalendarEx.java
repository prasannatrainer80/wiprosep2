package com.wipro.test;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		cal.add(Calendar.DAY_OF_MONTH, 5);
		System.out.println(cal.getTime());
		cal.add(Calendar.MONTH, 3);
		System.out.println(cal.getTime());
	}
}
