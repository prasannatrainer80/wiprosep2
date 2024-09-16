package com.wipro.lamb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEmploy {

	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Archana", 99234.22));
		employList.add(new Employ(2, "Deepthi", 90032.22));
		employList.add(new Employ(3, "Vipul", 88422.22));
		employList.add(new Employ(4, "Taraka", 89022.22));
		employList.add(new Employ(5, "Ajinkya", 91113.22));
		employList.add(new Employ(6, "Mounika", 89022.22));
		employList.add(new Employ(7, "Kshama", 98832.22));
		
		Collections.sort(employList, (e1, e2) -> {
			return e1.name.compareTo(e2.name);
		});
		
		System.out.println("Sort By Name  ");
		employList.forEach(x -> {
			System.out.println(x);
		});
		
		Collections.sort(employList, (e1, e2) -> {
			return (int) (e1.basic - e2.basic);
		});
		
		System.out.println("Sort By Empno Wise  ");
		employList.forEach(x -> {
			System.out.println(x);
		});

	}
}
