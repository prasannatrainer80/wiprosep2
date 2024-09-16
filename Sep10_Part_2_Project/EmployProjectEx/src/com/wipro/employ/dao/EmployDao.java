package com.wipro.employ.dao;

import java.util.List;

import com.wipro.employ.model.Employ;

public interface EmployDao {

	List<Employ> showEmployDao();
	String addEmployDao(Employ employ);
}
