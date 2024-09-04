package com.wipro.sup;

class Employ {
	
	int empno;
	String name;
	double basic;
	public Employ(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
}

class Vipul extends Employ {

	public Vipul(int empno, String name, double basic) {
		super(empno, name, basic);
	}
	
}

class Archana extends Employ {

	public Archana(int empno, String name, double basic) {
		super(empno, name, basic);
	}
	
}
public class SupCon {
	public static void main(String[] args) {
		Employ e1 = new Vipul(1, "Vipul", 84824);
		System.out.println(e1);
		
		Employ e2 = new Archana(2, "Archana", 99423.44);
		System.out.println(e2);
	}
}
