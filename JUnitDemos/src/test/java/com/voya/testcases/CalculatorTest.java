package com.voya.testcases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.voya.training.Calculator;

public class CalculatorTest {
	
	Calculator calculator = null;

	@BeforeAll
	static void init() throws Exception {
		System.out.println("called before all the testcases");
	}

	@AfterAll
	static void cleanup() throws Exception {
		System.out.println("called after all the testcases");
	}

	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
		System.out.println("called before each testcase");
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator = null;
		System.out.println();
	}

	@Test
	@DisplayName("Testing sum method")
	void testSum() {
		int actual = calculator.sum(10, 20);
		Assertions.assertEquals(30,actual,"output should be 30");
	}
	
	@Test
	@DisplayName("Testing product method")
	void testproduct() {
		int actual = calculator.product(10, 20);
		Assertions.assertEquals(200,actual,"output should be 200");
	}
	
	@Test
	@Disabled
	@DisplayName("Testing greetMessage method")
	void testgreetMessage() {
		String username = "mohit";
		String actual = calculator.greetMessage(username);
		assertEquals("Welcome MOHIT",actual,"output should be mohit");
	}
	
	@Test
	@Tag("first")
	@DisplayName("Testing list method")
	void testshowCourses() {
		List<String> coursesInput = Arrays.asList("CSS","Java","Spring","Angular","html");
		
		List<String> expected = Arrays.asList("Angular","CSS","Java","Spring","html");
		List<String> actual = calculator.showCourses(coursesInput);
		
		assertEquals(expected,actual);
	}

}
