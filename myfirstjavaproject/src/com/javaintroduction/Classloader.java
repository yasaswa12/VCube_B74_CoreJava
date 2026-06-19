package com.javaintroduction;

public class Classloader {

	public static void main(String[] args) throws ClassNotFoundException{

		System.out.println("Welcome to main method");
		System.out.println("Main started");
		
		Class.forName("java.lang.System");
		Class.forName("java.util.Scanner");
		Class.forName("com.javaintroduction.Classloader");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("main stoped");
	}

}
