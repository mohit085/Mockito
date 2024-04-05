package com.student.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.voya.exception.InvalidNumException;
import com.voya.training.StudentDetails;

class StudentTest {
	
	StudentDetails student = null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.err.println("called before all the testcases");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.err.println("called after all the testcases");
	}

	@BeforeEach
	void setUp() throws Exception {
		student = new StudentDetails();
		System.err.println("called before each test cases");
	}

	@AfterEach
	void tearDown() throws Exception {
		student = null;
		System.out.println();
	}

	@Test
	@DisplayName ("Testing positive marks")
	void testtotalMarks() {	
		assertEquals(250,student.totalMarks(90, 80, 80),"not correct");
	}
	
	@Test
	@Tag("negative")
	@DisplayName("Testing negative marks")
	void testNegMarks() {
		Assertions.assertThrows(InvalidNumException.class,() -> student.totalMarks(90,-20,60));
	}
	
	
	@Test
	@DisplayName("Testing marks greater than 100")
	void testGreaterMarks() throws InvalidNumException{
		assertThrows(InvalidNumException.class,() -> student.totalMarks(190,182,45));
	}
}
