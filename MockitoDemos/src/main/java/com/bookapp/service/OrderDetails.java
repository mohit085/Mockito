package com.bookapp.service;

import java.util.*;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;

public class OrderDetails {
	
	private IBookService bookService;

	public void setBookService(IBookService bookService) {
		this.bookService = bookService;
	}

	public List<Book> showBooks(String author) throws BookNotFoundException{
		List<Book> books = bookService.getByAuthor(author);
		if(books.isEmpty())
			throw new BookNotFoundException();
		Collections.sort(books,(b1,b2)->b1.getTitle().compareTo(b2.getTitle()));
		return books;
	}
	
	public String orderBook(int bookid) {
		Book book = bookService.getById(bookid);
		return book.getTitle();
	} 
	
	public double getTotalPriceByDiscount(double price,int discountamount) {
		List<Book> books = bookService.getByLessPrice(price);
		return 0.0;
	}
}
