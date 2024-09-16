package com.wipro.thrs;

class Data {
	synchronized void dispMsg(String name) {
		System.out.print("Hello  " +name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(" How are You...!");
	}
}

class Subbarayudu implements Runnable {

	Data data;
	public Subbarayudu(Data data) {
		this.data = data;
	}
	
	@Override
	public void run() {
		data.dispMsg("Subbarayudu");
	}
	
}

class Mounika implements Runnable {

	Data data;
	
	Mounika(Data data) {
		this.data = data;
	}
	
	@Override
	public void run() {
		data.dispMsg("Mounika");
	}
	
}

class Aditya implements Runnable {

	Data data;
	
	Aditya(Data data) {
		this.data = data;
	}
	
	@Override
	public void run() {
		data.dispMsg("Aditya");
	}
	
}
public class SyncEx {

	public static void main(String[] args) {
		Data data = new Data();
		Aditya aditya = new Aditya(data);
		Mounika mounika = new Mounika(data);
		Subbarayudu subbarayudu = new Subbarayudu(data);
		
		Thread t1 = new Thread(aditya);
		Thread t2 = new Thread(mounika);
		Thread t3 = new Thread(subbarayudu);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
