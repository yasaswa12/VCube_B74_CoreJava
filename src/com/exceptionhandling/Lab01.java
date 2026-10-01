package com.exceptionhandling;

import java.util.Scanner;

public class Lab01 {
	public static void main() {
		Scanner sc=new Scanner(System.in);
		System.out.println("main method started");
		System.out.println("Enter a number as string");
		String a=sc.next();
		
		System.out.println("Enter another number");
		String b=sc.next();
		try {
			int a1=Integer.parseInt(a);
			int b1=Integer.parseInt(b);
			System.out.println(a1/b1);	
		}catch(NumberFormatException ne) {
			System.out.println("Catch from ne");
			System.out.println(ne);
		}catch(ArithmeticException ae) {
			System.out.println("catch from ae");
		}catch(Exception e) {
			System.out.println("catch from e");
		}
		int arr[]=new int[5];
		System.out.println("Enter an index pos to see the value");
		try {
			int i1=sc.nextInt();
			System.out.println(arr[i1]);
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
		}
	}
}
