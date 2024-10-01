package com.wipro.jsp;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;


public class EmployDaoImpl implements EmployDao {

	static List<Employ> employList;
	
	static StringBuilder errors = new StringBuilder();
	public boolean doValid(Employ employ) {
		boolean flag = true;
		if (employ.getEmpno() <= 0) {
			errors.append("Error...Please Enter EmployNo Positive");
			flag =false;
		}
		return flag;
	}
	static {
		employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Muhammad", Gender.MALE, "Java", "Programmer", 99424.22));
		employList.add(new Employ(2, "Nikhita", Gender.FEMALE, "Dotnet", "Manager", 87742.22));
		employList.add(new Employ(3, "Subbarayudu", Gender.MALE, "Java", "TeamLead", 90042.22));
		employList.add(new Employ(4, "Kalpana", Gender.FEMALE, "Sql", "Developer", 89942.22));
		employList.add(new Employ(5, "Simran", Gender.FEMALE, "Java", "Programmer", 90424.22));
		employList.add(new Employ(6, "Vipul", Gender.MALE, "React", "TeamLead", 98842.22));
	}
	
	@Override
	public List<Employ> showEmployDao() {
		// TODO Auto-generated method stub
		return employList;
	}

	@Override
	public Employ searchEmployDao(int empno) {
		Employ employFound = null;
		for (Employ employ : employList) {
			if (employ.getEmpno() == empno) {
				employFound = employ;
				break;
			}
		}
		return employFound;
	}

	@Override
	public String addEmployDao(Employ employ) {
		if (doValid(employ)==true) {
			employList.add(employ);
			return "Employ Record Inserted...";	
		} else {
			return errors.toString();
		}
		
	}

	@Override
	public String updateEmployDao(Employ employ) {
		Employ employFound = searchEmployDao(employ.getEmpno());
		if (employFound!=null) {
			employFound.setName(employ.getName());
			employFound.setGender(employ.getGender());
			employFound.setDept(employ.getDept());
			employFound.setDesig(employ.getDesig());
			employFound.setBasic(employ.getBasic());
			return "Employ Record Updated...";
		}
		return "Employ Record Not Found...";
	}

	@Override
	public String deleteEmployDao(int empno) {
		Employ employFound = searchEmployDao(empno);
		if (employFound!=null) {
			employList.remove(employFound);
			return "Employ Record Deleted...";
		}
		return "Employ Record Not Found...";
	}

	@Override
	public int validateEmploy(String user, String pwd) {
		Map<String, String> userData = new Hashtable<String, String>();
		userData.put("Ajinkya", "Mohite");
		userData.put("Khushi", "Taliya");
		userData.put("Taraka", "Prabhu");
		userData.put("Vipul", "Magdum");
		userData.put("Rinka", "Kumari");
		String res = userData.getOrDefault(user, "Not Found");
		if (res.equals(pwd)) {
			return 1;
		}
		return 0;
	}

}
