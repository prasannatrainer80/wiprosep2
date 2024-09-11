package com.wipro.employ.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.wipro.employ.model.Employ;

public interface EmployDao {

	List<Employ> showEmployDao();
	String addEmployDao(Employ employ);
	Employ searchEmployDao(int empno);
	String deleteEmployDao(int empno);
	String updateEmployDao(Employ employ);
	String writeToFileDao() throws FileNotFoundException, IOException;
	String readFromFileDao() throws FileNotFoundException, IOException, ClassNotFoundException;
}
