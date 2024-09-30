package com.java.wipro;

public class App {

  public static void main(String[] args) {
    System.out.println("Hello World!");
    
    Employ emp1 = new Employ(1, "Deepthi", 48823.22);
    System.out.println(emp1);
    
    Employ emp2 = new Employ();
    emp2.setEmpno(1);
    emp2.setName("Raj");
    emp2.setBasic(84823.43);
    
    System.out.println(emp2);
    		
  }

}
