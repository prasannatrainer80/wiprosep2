package com.wipro.gen;

class Data<T> {
	public void swap(T a, T b) {
		T t;
		t = a;
		a = b;
		b = t;
		System.out.println("A value is " +a+ " B value " +b);
	}
//	public void swap(boolean a, boolean b) {
//		
//	}
//	public void swap(String a, String b) {
//		
//	}
//	public void swap(double a, double b) {
//		
//	}
}
public class GenExample1 {

	public static void main(String[] args) {
		int a, b;
		a = 5;
		b = 7;
		Data data = new Data();
		data.swap(a, b);
		String s1="Subbarayudu",s2="Vipul";
		data.swap(s1, s2);
		boolean b1 = true, b2 = false;
		data.swap(b1, b2);
		double d1 = 12.5, d2 = 8.3;
		data.swap(d1, d2);
	}
}
