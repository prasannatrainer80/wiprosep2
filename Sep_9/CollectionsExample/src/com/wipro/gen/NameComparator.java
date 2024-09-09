package com.wipro.gen;

import java.util.Comparator;

public class NameComparator implements Comparator<Employ> {

	@Override
	public int compare(Employ o1, Employ o2) {
		Employ e1 = (Employ)o1;
		Employ e2 = (Employ)o2;
		
		return e1.name.compareTo(e2.name);
	}

}
