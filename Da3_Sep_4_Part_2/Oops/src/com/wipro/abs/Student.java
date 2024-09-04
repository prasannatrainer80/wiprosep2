package com.wipro.abs;

public class Student {

	int sid;
	String sname;
	double cgp;
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", cgp=" + cgp + "]";
	}

	public Student(int sid, String sname, double cgp) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.cgp = cgp;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
