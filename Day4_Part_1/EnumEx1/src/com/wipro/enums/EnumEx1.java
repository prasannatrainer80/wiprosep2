package com.wipro.enums;

enum WeekDays  {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}


public class EnumEx1 {

	public static void main(String[] args) {
		WeekDays wd = WeekDays.THURSDAY;
		System.out.println("Week Day is  " +wd);
	}
}
