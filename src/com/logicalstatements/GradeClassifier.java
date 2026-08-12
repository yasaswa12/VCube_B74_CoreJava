package com.logicalstatements;

import java.util.Scanner;

public class GradeClassifier {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your marks: ");
     double marks=sc.nextDouble();
     if(marks<0 || marks>100)
    	 System.out.println("Invalid marks");
     else if(marks >= 90)
    	 System.out.println("Grade is Excellent ");
     else if(marks >= 80)
    	 System.out.println("Grade is A");
     else if(marks >= 70)
    	 System.out.println("Grade is B "); 
     else if(marks >= 60)
    	 System.out.println("Grade is C ");
     else if(marks >= 50)
    	 System.out.println("Grade is D ");
     else if(marks >= 40)
    	 System.out.println("Grade is E ");
     else
    	 System.out.println("You are border Passed");
     
     
     sc.close();
	}


}
