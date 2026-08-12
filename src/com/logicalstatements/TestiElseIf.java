package com.logicalstatements;

import java.util.Scanner;

public class TestiElseIf {

	public static void main(String[] args) {
		
	
     Scanner sc=new Scanner(System.in);
     
     System.out.println("Enter your age:");
     int age=sc.nextInt();
     
     if(age>0 && age<=5) {
    	 System.out.println("You are kids");
     }else if(age >5 && age<=12) {
    	 System.out.println("You are children");
     }else if( age>12 && age<=19)
    	 System.out.println("You are teenagers"); 
     else if(age>19 && age<=35)
    	 System.out.println("You are youngsters");
     else if(age>35 && age<= 60)
     System.out.println("Your are in middle age");
     else if( age> 60) {
    	 System.out.println("you are in old age");
     }
     else
    	 System.out.println("Invalid");
	}

}
