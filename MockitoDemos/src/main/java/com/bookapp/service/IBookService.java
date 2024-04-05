package com.bookapp.service;

import java.util.*;

import com.bookapp.model.Book;

public interface IBookService {
	List<Book> getByAuthor(String author);
	
	List<Book> getByLessPrice(double price);
	
	Book getById(int bookid);

}
