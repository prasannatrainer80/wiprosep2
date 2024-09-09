package com.wipro.lamb;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample1 {

	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Archana", 99234.22));
		employList.add(new Employ(2, "Deepthi", 90032.22));
		employList.add(new Employ(3, "Vipul", 88422.22));
		employList.add(new Employ(4, "Taraka", 89022.22));
		employList.add(new Employ(5, "Ajinkya", 91113.22));
		employList.add(new Employ(6, "Mounika", 89022.22));
		employList.add(new Employ(7, "Kshama", 98832.22));
		
		Stream<Employ> filtered1 = employList.stream().filter(x -> 
			x.basic >= 90000);
		
		System.out.println("Filtered Data is  ");
		filtered1.forEach(x -> {
			System.out.println(x);
		});
	}
}
