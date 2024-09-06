package com.wipro.cols;

import java.util.ArrayList;
import java.util.List;

public class ListEmployEx {

	public static void main(String[] args) {
		List employList = new ArrayList();
		employList.add(new Employ(1, "Lavanya", 99423.44));
		employList.add(new Employ(2, "Archana", 90042.44));
		employList.add(new Employ(3, "GangaMani", 91155.44));
		employList.add(new Employ(4, "Subbarayudu", 92266.44));
		employList.add(new Employ(5, "Khushi", 93311.44));
		employList.add(new Employ(6, "Kshama", 90994.44));
		employList.add(new Employ(7, "Mounika", 97733.44));
		
		System.out.println("Employ Records are  ");
		for (Object object : employList) {
			Employ employ = (Employ)object;
			System.out.println(employ);
		}
		
	}
}
