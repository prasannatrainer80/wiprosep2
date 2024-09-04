package com.wipro.abs;

abstract class WiproTraining {
	abstract void topic();
	abstract void trainer();
}


class JavaFullStack extends WiproTraining {

	@Override
	void topic() {
		System.out.println("Topic is from Java to React...");
	}

	@Override
	void trainer() {
		System.out.println("Trainer is Ramgopal...");
	}
	
}
class DotnetTraining extends WiproTraining {

	@Override
	void topic() {
		System.out.println("Topic is from Console to Web...");
	}

	@Override
	void trainer() {
		System.out.println("Trainer is VenuGopal...");
	}
	
}
class JavaTraining extends WiproTraining {

	@Override
	void topic() {
		System.out.println("Topic is From Core to Angular...");
	}

	@Override
	void trainer() {
		System.out.println("Java Training for 40 days including Capstone...");
	}
	
}

public class AbsTest {
	public static void main(String[] args) {
		WiproTraining[] arr = new WiproTraining[] {
			new JavaFullStack(), new JavaTraining(),new DotnetTraining(),
			new JavaFullStack(), new JavaTraining(),
			new JavaFullStack(), new JavaTraining(),
			new DotnetTraining(),
			new JavaFullStack()
		};
		
		for (WiproTraining wt : arr) {
			if (wt instanceof JavaTraining) {
				wt.topic();
				wt.trainer();
			}
		}
	}
}
