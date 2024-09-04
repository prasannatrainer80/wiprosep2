package com.wipro.intf;

interface IOne {
	void name();
}

interface ITwo {
	void email();
}

class Demo implements IOne, ITwo {

	@Override
	public void email() {
		System.out.println("Email is lavanya@gmail.com");
	}

	@Override
	public void name() {
		System.out.println("Name is Lavanya...");
	}
	
}
public class MultiInh {
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.name();
		demo.email();
	}
}
