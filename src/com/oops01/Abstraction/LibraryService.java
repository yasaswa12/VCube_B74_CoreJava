package com.oops01.Abstraction;

public class LibraryService implements Library{
	static Book[] books=new Book[10];
	static int count=0;
	@Override
	public void createBook(Book book) {
		if(count < books.length) {
			books[count++]=book;
			System.out.println("Book added successfully !");
		}else {
			System.out.println("Library is full");
		}
		
	}
	@Override
	public void getAllBooks() {
		System.out.println("============================================");
		if(count != 0) {
			for(int i = 0; i<count;i++) {
				Book currentBook=books[i];
				currentBook.displayBook();
			}
		}else{
			System.out.println("Found zero books !!!!");
		}
		System.out.println("==========================================");
	}
	@Override
	public void getBookById(int bookId) {
		System.out.println("Request for get book by id: ");
		for(int i=0;i<count;i++) {
			if(bookId == books[i].getBookId()) {
				books[i].displayBook();
				return;
			}
		}
	}
	
	@Override
	public void updateBook(Book book) {
		System.out.println("Request for update book");
		for(int i=0;i<count;i++) {
			if(book.getBookId() == books[i].getBookId()) {
				Book obj=books[i];
				obj.setBookName(book.getBookName());
				obj.setAuthor(book.getAuthor());
				obj.setPrice(book.getPrice());
				obj.setYop(book.getYop());
				return;
			}
		}
	}
	@Override
	public void deleteBook(int bookId) {
		for(int i=0;i<count;i++) {
			if(bookId== books[i].getBookId()) {
				for(int j=i;j<count-1;j++) {
					books[j]=books[j+1];
				}
				books[count-1]=null;
				count--;
				System.out.println("Book deleted successfully");
				return;
			}
			
		}
		System.out.println("Book  not found");
	}
	
}
