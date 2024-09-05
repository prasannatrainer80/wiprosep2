package com.wipro.test;

public class Employ {

	private int empno;
	private String name;
	private Gender gender;
	private String dept;
	private String desig;
	private double basic;

	public Employ(int empno, String name, Gender gender, String dept, String desig, double basic) {
		this.empno = empno;
		this.name = name;
		this.gender = gender;
		this.dept = dept;
		this.desig = desig;
		this.basic = basic;
	}
	public Employ() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", gender=" + gender + ", dept=" + dept + ", desig="
				+ desig + ", basic=" + basic + "]";
	}
	
	
}
