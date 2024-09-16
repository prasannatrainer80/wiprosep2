package com.wipro.employ.main;

import java.util.List;
import java.util.Scanner;

import com.wipro.employ.bal.EmployBal;
import com.wipro.employ.exception.EmployException;
import com.wipro.employ.model.Employ;
import com.wipro.employ.model.Gender;

public class EmployMain {

	static Scanner sc = new Scanner(System.in);
	
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
	
	public static void showEmployMain() {
		List<Employ> employList = new EmployBal().showEmployBal();
		employList.forEach(x -> {
			System.out.println(x);
		});
	}
	
	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("O P T I O N S ");
			System.out.println("--------------");
			System.out.println("1. Add Employ");
			System.out.println("2. Show Employ");
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
			case 8 : 
				return;
			}
		} while(choice!=8);
	}
}
