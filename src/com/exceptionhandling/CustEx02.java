package com.exceptionhandling;

import java.util.Scanner;

class InvalidPasswordException extends Exception{
	public InvalidPasswordException() {
		
	}
public InvalidPasswordException(String s) {
		System.err.println(s);
	}
}
public class CustEx02 {

	public static void main(String[] args) throws InvalidPasswordException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your password");
		String password=sc.next();
		if(password.length()>=8) {
			System.out.println("Password accepted");
		}else {
			throw new InvalidPasswordException("Password must countain 8 or more characters");
		}
	}

}
