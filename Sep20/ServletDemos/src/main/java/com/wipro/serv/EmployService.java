package com.wipro.serv;

import java.util.ArrayList;
import java.util.List;

public class EmployService {

	static List<Employ> employList;
	static {
		employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Muhammad", "MALE", "Java", "Programmer", 99424.22));
		employList.add(new Employ(2, "Nikhita", "FEMALE", "Dotnet", "Manager", 87742.22));
		employList.add(new Employ(3, "Subbarayudu", "MALE", "Java", "TeamLead", 90042.22));
		employList.add(new Employ(4, "Kalpana", "FEMALE", "Sql", "Developer", 89942.22));
		employList.add(new Employ(5, "Simran", "FEMALE", "Java", "Programmer", 90424.22));
		employList.add(new Employ(6, "Vipul", "MALE", "React", "TeamLead", 98842.22));
	}
	
	public static List<Employ> showEmploy() {
		return employList;
	}
	
}
