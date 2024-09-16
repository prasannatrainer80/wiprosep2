package com.wipro.testing;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class DemoTest {

	static Demo demo;
	
	@BeforeAll
	static void setUp() {
		demo = new Demo();
		System.out.println("BeforeAll Method executed...");
	}
	
	@AfterAll 
	static void cleanUp() {
		demo = null;
		System.out.println("After All method executed...cleanup done...");
	}
	
	@BeforeEach
	void beforeEach() {
		System.out.println("Before for each test case...");
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("After for each test case...");
	}
	
	@Test
	void testSayHello() {
		assertEquals("Welcome to Junit 5...", demo.sayHello());
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1, 2, 3, 4, 5})
	void testSquare(int x) {
		assertEquals(x * x, demo.power(x));
	}
	
	@Test
	public void testArrayEquals() {
		int[] a = new int[] {1,2,3};
		int[] b = new int[] {1,2,3};
		assertArrayEquals(a, b);
	}
	
	@Test
	public void testAssumption() {
		assertTrue(5 > 1);
	}
	
	@Test 
	@Disabled
	public void testSomething() {
		
	}
	
	@Test
	public void lambdaTest() {
		int[] numbers = {0, 1, 2, 3, 4};
		assertAll("numbers", 
			() -> assertEquals(numbers[0], 0),
			() -> assertEquals(numbers[1], 1),
			() -> assertEquals(numbers[2], 2),
			() -> assertEquals(numbers[3], 3),
			() -> assertEquals(numbers[4], 4)
		);
	}
	
	@Test
	public void testSum() {
		assertEquals(5, demo.sum(2, 3));
	}
	
	@Test
	public void testMax3() {
		assertEquals(5, demo.max3(5, 3, 2));
		assertEquals(5, demo.max3(3, 5, 2));
		assertEquals(5, demo.max3(2, 3, 5));
	}

}
