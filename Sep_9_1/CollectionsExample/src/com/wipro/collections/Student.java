package com.wipro.collections;

public class Student {

	int sno;
	String name;
	String city;
	double cgp;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sno, String name, String city, double cgp) {
		super();
		this.sno = sno;
		this.name = name;
		this.city = city;
		this.cgp = cgp;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", city=" + city + ", cgp=" + cgp + "]";
	}
	
	
	
	// add 5 to 10 records and sort by name and cgp
}
