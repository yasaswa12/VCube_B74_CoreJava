package com.exceptionhandling;

import java.util.Scanner;

class InvalidAgeException extends RuntimeException{
	public InvalidAgeException() {
		
	}
	public InvalidAgeException(String s) {
		super(s);
	}
}
public class CustEx {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		if(age<18) {
			throw new InvalidAgeException("Babu neku inka age raledhu");
		}else {
			System.out.println("Registration successfull");
		}
	}

}
