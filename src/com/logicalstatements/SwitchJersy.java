package com.logicalstatements;

import java.util.Scanner;

public class SwitchJersy {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your fav jersyNo");
    int jNo=sc.nextInt();
    
    switch(jNo) {
    
    case 7:
    	System.out.println("Mahendra Singh Dhoni");
    	break;
    case 18:
    	System.out.println("Virat Kohli");
    	break;
    	
    case 45:
    	System.out.println("Rohit Sharma");
    	break;
    	
    default:
    	System.out.println("Invaid Jersy no \n"+ "Not Found");
    	
    }
    
    System.out.println("Main Method ended");
	}

}
