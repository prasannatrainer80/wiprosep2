package com.wipro.inh;


class C1 {
	static {
		System.out.println("Static Constructor C1...");
	}
	C1() {
		System.out.println("Base Class Constructor...");
	}
}

class C2 extends C1 {
	static {
		System.out.println("Static Constructor C2...");
	}
	C2() {
		System.out.println("Derived Class Constructor...");
	}
}

public class Inhc {
	public static void main(String[] args) {
		C2 obj = new C2();
	}
}
