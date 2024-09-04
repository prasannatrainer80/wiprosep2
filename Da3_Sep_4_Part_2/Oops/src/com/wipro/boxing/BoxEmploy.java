package com.wipro.boxing;

public class BoxEmploy {

	public void show(Object ob) {
	//	int x = (Integer)ob;
		Employ e1 = (Employ)ob;
		System.out.println("Employ No " +e1.empno);
		System.out.println("Employ Name " +e1.name);
		System.out.println("Basic  " +e1.basic);
	}
	public static void main(String[] args) {
		Employ e1 = new Employ();
		e1.empno = 1;
		e1.name = "Ajinkya";
		e1.basic = 83235.22;
		
		BoxEmploy box = new BoxEmploy();
		box.show(e1);
	}
}
