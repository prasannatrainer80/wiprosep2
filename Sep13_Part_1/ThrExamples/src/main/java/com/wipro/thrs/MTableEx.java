package com.wipro.thrs;

class Tab1 implements Runnable {

	TableEx tableEx;
	Tab1(TableEx tableEx) {
		this.tableEx = tableEx;
	}
	@Override
	public void run() {
		tableEx.displayTab(8);
	}
}

class Tab2 implements Runnable {

	TableEx tableEx;
	Tab2(TableEx tableEx) {
		this.tableEx = tableEx;
	}
	@Override
	public void run() {
		tableEx.displayTab(12);
	}
}

class Tab3 implements Runnable {

	TableEx tableEx;
	Tab3(TableEx tableEx) {
		this.tableEx = tableEx;
	}
	@Override
	public void run() {
		tableEx.displayTab(13);
	}
}



class TableEx {
	synchronized void displayTab(int n) {
		int p;
		for(int i=1;i<=10;i++) {
			p = n * i;
			System.out.println(n + " * " +i+ " = " + p);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MTableEx {
	public static void main(String[] args) {
		TableEx obj = new TableEx();
		Thread t1 = new Thread(new Tab1(obj));
		Thread t2 = new Thread(new Tab2(obj));
		Thread t3 = new Thread(new Tab3(obj));
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
