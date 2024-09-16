package com.wipro.files;

public class PropWrite {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmpno(1);
		employee.setName("Archana");
		employee.setGender(Gender.FEMALE);
		employee.setDept("Java");
		employee.setDesig("Programmer");
		employee.setBasic(99992.44);
		
		System.out.println("Employ No  " +employee.getEmpno());
		System.out.println("Employ Name " +employee.getName());
		System.out.println("Gender  " +employee.getGender());
		System.out.println("Department  " +employee.getDept());
		System.out.println("Designation  " +employee.getDesig());
		System.out.println("Basic  " +employee.getBasic());
	}
}
