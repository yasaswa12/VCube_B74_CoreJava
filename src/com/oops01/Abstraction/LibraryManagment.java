package com.oops01.Abstraction;

public class LibraryManagment {

	public static void main(String[] args) {
		System.out.println("Welcome to library managmnet services");
		LibraryService service=new LibraryService();
		//create books
		Book b1=new Book(1,"Amma Dairy Lo Konni Pagilu","Ravi Manthri",330,"05-05-2024");
		Book b2=new Book(2,"Dheere samere ganga there","Ravi Manthri",300,"05-05-2025");
		Book b3=new Book(3,"Seetha raisna ramayanam","xyz",330,"05-12-2025");
		//Add books
		service.createBook(b1);
		service.createBook(b2);
		service.createBook(b3);
		//Display All books
		service.getAllBooks();
		//find book
		service.getBookById(3);
		//Update Book
		Book b3update=new Book(3,"Seetha raisna ramayanam","sampreeth",330,"05-12-2025");
		service.updateBook(b3update);
		service.getAllBooks();
		Book b4=new Book(4,"parichayam","xyz",101,"09-98-8989");
		service.createBook(b4);
		//Delete book
		service.deleteBook(4);
		service.getAllBooks();
		
	}

}
