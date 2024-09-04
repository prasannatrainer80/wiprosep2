package com.wipro.abs;

public class Employ {

	int empId;
	String name;
	double basic;
	
	@Override
	public String toString() {
		return "Employ [empId=" + empId + ", name=" + name + ", basic=" + basic + "]";
	}

	public Employ(int empId, String name, double basic) {
		super();
		this.empId = empId;
		this.name = name;
		this.basic = basic;
	}

	public Employ() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
