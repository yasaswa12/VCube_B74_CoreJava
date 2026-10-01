package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestExdemo01 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		
		
		try {
			System.out.println("Enter a number:");
			int b=sc.nextInt();
			System.out.println("in try");
			System.out.println(a/b);
		}catch(InputMismatchException e) {
			System.out.println("in catch");
			e.printStackTrace();
		}catch(ArithmeticException e) {
			System.err.println(e);
		}
		
		System.out.println("main method ended");
	}

}
