package com.wipro.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployTest {

	@Test
	void testConstructor() {
		Employ employ = new Employ();
		assertNotNull(employ); 
		Employ employ1 = new Employ(1, "Simran", Gender.FEMALE, "Java", "Programmer", 88822.99);
		assertEquals(1, employ1.getEmpno());
		assertEquals("Simran", employ1.getName());
		assertEquals(Gender.FEMALE, employ1.getGender());
		assertEquals("Java", employ1.getDept());
		assertEquals("Programmer", employ1.getDesig());
		assertEquals(88822.99, employ1.getBasic(), 2);
	} 
	
	@Test
	public void testHashCode() {
		Employ employ1 = new Employ(1, "Simran", Gender.FEMALE, "Java", "Programmer", 88822.99);
		Employ employ2 = new Employ(1, "Simran", Gender.FEMALE, "Java", "Programmer", 88822.99);
		assertEquals(employ1.hashCode(), employ2.hashCode());
	}
	
	@Test
	public void testGettersAndSetters() {
		Employ employ = new Employ();
		employ.setEmpno(1);
		employ.setName("Archana");
		employ.setGender(Gender.FEMALE);
		employ.setDept("Java");
		employ.setDesig("Programmer");
		employ.setBasic(88822.99);
		
		assertEquals(1, employ.getEmpno());
		assertEquals("Archana", employ.getName());
		assertEquals(Gender.FEMALE, employ.getGender());
		assertEquals("Java", employ.getDept());
		assertEquals("Programmer", employ.getDesig());
		assertEquals(88822.99, employ.getBasic(), 2);
	}

}
