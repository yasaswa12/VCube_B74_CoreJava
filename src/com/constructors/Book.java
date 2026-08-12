package com.constructors;

public class Book {
    int bookId;
    String title;
    String author;
    Book(){
    	
    }
    Book(int id,String title,String author){
    	this.bookId=id;
    	this.title=title;
    	this.author=author;
    }
    Book(Book b){
    	this.bookId=b.bookId;
    	this.title=b.title;
    	this.author=b.author;
    }
	public static void main(String[] args) {
		Book b1=new Book(101,"java","srikanth");
		b1.show();
		Book b2= new Book(b1);
		b2.show();
	}
 void show() {
	 System.out.println("Book ID :" + bookId);
	 System.out.println("Book title : "+ title);
	 System.out.println("Book Author :"+ author);
 }
}
