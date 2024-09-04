package com.wipro.p2;

import com.wipro.p1.Demo;

public class Testing extends Demo {

	public void show() {
		Testing testing = new Testing();
		System.out.println(testing.protectedGreeting);
		System.out.println(testing.publicGreeting);
	}
}
