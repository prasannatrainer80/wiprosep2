package com.wipro.intf;

interface ITraining {
	String company = "Wipro";
	void name();
	void email();
}

class Simran implements ITraining {

	@Override
	public void name() {
		System.out.println("Name is Simran...");
		System.out.println("Company is " +company);
//		company = "Wipro Ltd";
	}

	@Override
	public void email() {
		System.out.println("Email is simran@gmail.com");
	}
	
}
class Kalpana implements ITraining {

	@Override
	public void name() {
		System.out.println("Name is Kalpana...");
	}

	@Override
	public void email() {
		System.out.println("Email is kalpana@gmail.com");
	}
	
}
public class IntfEx {
	public static void main(String[] args) {
		ITraining[] arr = new ITraining[] {
			new Kalpana(), new Simran()	
		};
		
		for (ITraining i : arr) {
			i.name();
			i.email();
		}
	}
}
