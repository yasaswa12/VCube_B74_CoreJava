package com.logicalstatements;

import java.util.Scanner;

public class TestlsDemo {

	public static void main(String[] args) {
		System.out.println("Main method started");
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your age:");
     int age=sc.nextInt();
     
     if(age>18) 
    	 System.out.println("Your are eligible for voting");
     else 
    	 System.out.println("you are not eligible for voting");
     
         System.out.println("hiii");
     
     System.out.println("Main  method ended");
	}

}
