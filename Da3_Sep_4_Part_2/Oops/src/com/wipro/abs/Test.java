package com.wipro.abs;

public class Test {

	public void show(Object ob) {
		if (ob instanceof Employ) {
			Employ employ = (Employ)ob;
			System.out.println(employ);
		}
		if (ob instanceof Student) {
			Student student = (Student)ob;
			System.out.println(student);
		}
	}
	public static void main(String[] args) {
		Student s1 = new Student(1, "Aditya", 8.5);
		Employ e1 = new Employ(10, "Ajinkya", 99234);
		Test test =new Test();
		test.show(s1);
		test.show(e1);
		
		
	}
}
