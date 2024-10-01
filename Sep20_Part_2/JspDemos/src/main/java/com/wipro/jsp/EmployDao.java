package com.wipro.jsp;

import java.util.List;

public interface EmployDao {
	List<Employ> showEmployDao();
	Employ searchEmployDao(int empno);
	String addEmployDao(Employ employ);
	String updateEmployDao(Employ employ);
	String deleteEmployDao(int empno);
	int validateEmploy(String user, String pwd);
}
