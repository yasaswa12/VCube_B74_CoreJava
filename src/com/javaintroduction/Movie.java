package com.javaintroduction;

public class Movie {
	//instance variables
	int movieId;
	String movieName;
	//static variables
	static String industryName;
		
public static void main(String []args) {
	Movie mv1=new Movie();
	mv1.movieId=130;
	industryName="TFI";
	mv1.movieName="RRR";
	System.out.println(mv1.movieId);
	System.out.println(industryName);
	System.out.println(mv1.movieName);
	
}
}
