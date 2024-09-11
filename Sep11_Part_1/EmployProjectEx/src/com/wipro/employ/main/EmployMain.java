package com.wipro.employ.main;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.wipro.employ.bal.EmployBal;
import com.wipro.employ.exception.EmployException;
import com.wipro.employ.model.Employ;
import com.wipro.employ.model.Gender;

public class EmployMain {

	static Scanner sc = new Scanner(System.in);
	
	public static void searchEmployMain() {
		System.out.println("Enter Employ No  ");
		int empno = sc.nextInt();
		Employ employFound = new EmployBal().searchEmployBal(empno);
		if (employFound!=null) {
			System.out.println(employFound);
		}else {
			System.out.println("*** Record Not Found ***");
		}
	}
	
	public static void deleteEmployMain() {
		int empno;
		System.out.println("Enter Employ Number   ");
		empno = sc.nextInt();
		System.out.println(new EmployBal().deleteEmployBal(empno));
	}
	public static void addEmployMain() throws EmployException {
		Employ employ = new Employ();
		System.out.println("Enter Employ No   ");
		employ.setEmpno(sc.nextInt());
		System.out.println("Enter Employ Name   ");
		employ.setName(sc.next());
		System.out.println("Enter Gender (MALE/FEMALE) ");
		employ.setGender(Gender.valueOf(sc.next()));
		System.out.println("Enter Department  ");
		employ.setDept(sc.next());
		System.out.println("Enter Designation  ");
		employ.setDesig(sc.next());
		System.out.println("Enter Basic  ");
		employ.setBasic(sc.nextDouble());
		
		EmployBal bal = new EmployBal();
		System.out.println(bal.addEmployBal(employ));
	}
	
	public static void updateEmployMain() throws EmployException {
		Employ employ = new Employ();
		System.out.println("Enter Employ No   ");
		employ.setEmpno(sc.nextInt());
		System.out.println("Enter Employ Name   ");
		employ.setName(sc.next());
		System.out.println("Enter Gender (MALE/FEMALE) ");
		employ.setGender(Gender.valueOf(sc.next()));
		System.out.println("Enter Department  ");
		employ.setDept(sc.next());
		System.out.println("Enter Designation  ");
		employ.setDesig(sc.next());
		System.out.println("Enter Basic  ");
		employ.setBasic(sc.nextDouble());
		
		EmployBal bal = new EmployBal();
		System.out.println(bal.updateEmployBal(employ));
	}
	
	public static void showEmployMain() {
		List<Employ> employList = new EmployBal().showEmployBal();
		employList.forEach(x -> {
			System.out.println(x);
		});
	}
	
	public static void readEmployFileMain() throws ClassNotFoundException, IOException {
		String result = new EmployBal().readFileBal();
		System.out.println(result);
	}
	
	public static void writeEmployFileMain() throws IOException {
		String result = new EmployBal().writeFileBal();
		System.out.println(result);
	}
	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("O P T I O N S ");
			System.out.println("--------------");
			System.out.println("1. Add Employ");
			System.out.println("2. Show Employ");
			System.out.println("3. Search Employ");
			System.out.println("4. Delete Employ");
			System.out.println("5. Update Employ");
			System.out.println("6. Write to File");
			System.out.println("7. Read From File");
			System.out.println("8. Exit");
			System.out.println("Enter Your Choice  ");
			choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				try {
					addEmployMain();
				} catch (EmployException e) {
					System.err.println(e.getMessage());
				}
				break;
			case 2 : 
					showEmployMain();
					break;
			case 3 : 
					searchEmployMain();
					break;
			case 4 : 
					deleteEmployMain();
					break;
			case 5 : 
				try {
					updateEmployMain();
				} catch (EmployException e) {
					System.err.println(e.getMessage());
				}
				break;
			case 6 : 
				try {
					writeEmployFileMain();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 7 : 
				try {
					readEmployFileMain();
				} catch (ClassNotFoundException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 8 : 
				return;
			}
		} while(choice!=8);
	}
}
