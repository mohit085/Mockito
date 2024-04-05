package com.voya.testcases.trial;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CheckerTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("called before all the test cases");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("called after all the test cases");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("called before each testcase");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("called after each testcase");
	}

	@Test
	@DisplayName("Testing Null ")
	void testNull() {
		List<String> mylist = null;
		assertNull(mylist);
	}
	
	@Test
	@DisplayName("Testing not null")
	void testNotNull() {
		List<String> mylist = new ArrayList<>();
		assertNotNull(mylist); // test case  will succeed
//		assertNull(mylist);  //test case will fail
	}
	
	@Test
	@Tag("simple")
	@DisplayName("Testing string references")
	void testSame() {
		String username = "Priya";
//		String nusername = new String("Priya");
		String nusername = "Priya";
		
		assertSame(username,nusername);
	}

}
