package com.oops01.Abstraction;

public interface Library {
	void createBook(Book book);
	void getAllBooks();
	void getBookById(int bookId);
	void updateBook(Book book);
	void deleteBook(int bookId);
	
}
