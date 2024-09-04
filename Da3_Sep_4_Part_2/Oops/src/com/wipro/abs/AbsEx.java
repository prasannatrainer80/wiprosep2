package com.wipro.abs;

abstract class Training {
	abstract void name();
	abstract void email();
}

class Kshama extends Training {

	@Override
	void name() {
		System.out.println("Name is Kshama...");
	}

	@Override
	void email() {
		System.out.println("Email is kshama@gmail.com");
	}
	
}

class Rayudu extends Training {

	@Override
	void name() {
		System.out.println("Name is Subbarayudu");
	}

	@Override
	void email() {
		System.out.println("Email is subbarayudu@gmail.com");
	}
	
}

class Archana extends Training {

	@Override
	void name() {
		System.out.println("Name is Archana...");
	}

	@Override
	void email() {
		System.out.println("Email is Archana@gmail.com");
	}
	
}
public class AbsEx {
	public static void main(String[] args) {
		Training obj1 = new Kshama();
		Training obj2 = new Archana();
		Training obj3 = new Rayudu();
		
//		int[] a = new int[] {1,3,4};
		
		Training[] arr = new Training[] {new Kshama(), new Archana(), new Rayudu()};
		
		for (Training t : arr) {
			t.name();
			t.email();
		}
	}
}
