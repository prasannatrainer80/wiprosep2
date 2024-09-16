package com.wipro.thrs;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

class Thr3 implements Runnable {

	@Override
	public void run() {
		Vector<String> names = new Vector<String>(3,2);
		names.add("Archana");
		names.add("Subbarayudu");
		names.add("Gangamani");
		names.add("Vipul");
		names.add("Adivya");
		for (String s : names) {
			System.out.println("Vector Data  " +s);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class Thr2 implements Runnable {

	@Override
	public void run() {
		Set<String> names = new TreeSet<String>();
		names.add("Archana");
		names.add("Subbarayudu");
		names.add("Gangamani");
		names.add("Vipul");
		names.add("Adivya");
		names.add("Archana");
		names.add("Subbarayudu");
		names.add("Gangamani");
		names.add("Vipul");
		names.add("Adivya");
		names.add("Subbarayudu");
		names.add("Gangamani");
		names.add("Vipul");
		names.add("Adivya");
		names.add("Subbarayudu");
		names.add("Gangamani");
		names.add("Vipul");
		names.add("Adivya");
		for (String s : names) {
			System.out.println("Sorted Set Data  " +s);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class Thr1 implements Runnable {
	@Override
	public void run() {
		List<String> names = new ArrayList<String>();
		names.add("Archana");
		names.add("Subbarayudu");
		names.add("Gangamani");
		names.add("Vipul");
		names.add("Adivya");
		for (String str : names) {
			System.out.println("ArrayList Value  " +str);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThrTest {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Thr1());
		Thread t2 = new Thread(new Thr2());
		Thread t3 = new Thread(new Thr3());
		
		t1.setPriority(Thread.NORM_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
	}
}
