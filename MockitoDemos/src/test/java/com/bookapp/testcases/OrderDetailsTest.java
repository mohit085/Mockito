package com.bookapp.testcases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.IBookService;
import com.bookapp.service.OrderDetails;

@RunWith(JUnitPlatform.class)
@ExtendWith(MockitoExtension.class)

class OrderDetailsTest {
	
	@Mock
	IBookService bookService;  // creating a proxy
	
	
	// creates an object of OrderDetails();
	// Injects bookservice into orderdetails using setter
	
	@InjectMocks
	OrderDetails orderDetails;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
	
	
	List<Book> bookList; 
	Book book1,book2,book3,book4,book5,book6;
	@BeforeEach
	void setUp() throws Exception {
	
		book1 = new Book("Java","Kathy",1900,1);
		book2 = new Book("Spring","Kathy",800,2);
		book3 = new Book("Java","Joe",800,3);
		book4 = new Book("Leadership","Kathy",1800,4);
		book5 = new Book("JSP","Kathy",800,5);
		book6 = new Book("Miracle","Kathy",800,6);
		bookList = Arrays.asList(book1,book2,book3,book4,book5,book6);
	}

	@AfterEach
	void tearDown() throws Exception {
		orderDetails = null;
	}

	@Test
	void testShowBooks() {
		String author = "Kathy";
		List<Book> booksByAuthor = Arrays.asList(book1,book2,book4,book5,book6);
		
		// calling the method using proxy and assuming that we got 5 books
		Mockito.when(bookService.getByAuthor(author)).thenReturn(booksByAuthor);
		
		List<Book> expected = Arrays.asList(book5,book1,book4,book6,book2);
		
		//the method to be tested. this line will be called first
		List<Book> actual = orderDetails.showBooks(author);
		//testing the method
		assertEquals(expected,actual);
	}
	
	@Test
	void testShowNoBooks()  {
		String author = "Priya";
		Mockito.when(bookService.getByAuthor(author)).thenReturn(new ArrayList<>());
		assertThrows(BookNotFoundException.class,()->orderDetails.showBooks(author));
		
	}
	
	@Test
	void testExShowBooks()  {
		String author = "Priya";
		Mockito.when(bookService.getByAuthor(author)).thenThrow(BookNotFoundException.class);
		assertThrows(BookNotFoundException.class,()->orderDetails.showBooks(author));
		
	}

}
