package com.wipro.abs;

class Aditya extends Emp {

	public Aditya(int empno, String name, double basic) {
		super(empno, name, basic);
		// TODO Auto-generated constructor stub
	}
	
}

class Mounika extends Emp {

	public Mounika(int empno, String name, double basic) {
		super(empno, name, basic);
		// TODO Auto-generated constructor stub
	}
	
}

abstract class Emp {

	int empno;
	String name;
	double basic;
	
	public Emp(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
}


public class AbsCon {
	public static void main(String[] args) {
		Emp[] arr = new Emp[] {
			new Aditya(1, "Aditya", 88420.44),
			new Mounika(2, "Mounika", 883242.22)
		};
		
		for (Emp emp : arr) {
			System.out.println(emp);
		}
	}
}
