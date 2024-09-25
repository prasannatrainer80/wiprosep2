package com.java.jdbc;

import java.util.List;

public interface EmployDao {

	List<Employ> showEmployDao();
	Employ searchEmployDao(int empno);
	String addEmployDao(Employ employ);
	String updateEmployDao(Employ employNew);
	String deleteEmployDao(int empno);
}
