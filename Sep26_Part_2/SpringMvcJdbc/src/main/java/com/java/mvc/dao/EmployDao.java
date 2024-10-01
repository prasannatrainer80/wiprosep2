package com.java.mvc.dao;

import java.util.List;

import com.java.mvc.model.Employ;

public interface EmployDao {
	List<Employ> showEmployDao();
	Employ searchEmploy(int empno);
	String updateEmploy(Employ employUpdate);
	String deleteEmploy(int empno);
	String addEmploy(Employ employ);
}
