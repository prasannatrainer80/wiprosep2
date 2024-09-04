package com.wipro.boxing;

public class EmployMain {

	public static void main(String[] args) {
		Employ e1 = new Employ();
		e1.empno = 1;
		e1.name = "Vipul";
		e1.basic = 83823;
		
		Employ e2 = new Employ();
		e2.empno = 3;
		e2.name = "Subbarayudu";
		e2.basic = 88325;
		
		System.out.println(e1);
		System.out.println(e2);
	}
}
