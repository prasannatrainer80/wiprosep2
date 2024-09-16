package com.wipro.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class EmploySearchMain {

	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ Number   ");
		empno = sc.nextInt();
		EmployDao dao = new EmployDaoImpl();
		try {
			Employ employFound = dao.searchEmployDao(empno);
			if (employFound != null) {
				System.out.println(employFound);
			} else {
				System.out.println("*** Employ Record Not Found ***");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
