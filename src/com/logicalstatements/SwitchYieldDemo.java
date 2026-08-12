package com.logicalstatements;

import java.util.Scanner;

public class SwitchYieldDemo {
	
    static String gradeDet(String grade) {
    	 
      String gradeDetails=switch(grade) {
      case "EX"->{System.out.println("Your Marks greater than 95");
       yield "Excelent";
      }
      case "A"->{System.out.println("Your Marks greater than 85");
      yield "Good";
     }
      case "B"->{System.out.println("Your Marks greater than 75");
      yield "average";
     }
      case "C"->{System.out.println("Your Marks greater than 65");
      yield "Above avg";
     }
      case "D"->{System.out.println("Your Marks greater than 55");
      yield "okay";
     }
      case "E"->{System.out.println("Your Marks greater than 35");
      yield "just pass";
     }
      default->{
      yield "Invalid grade/fail";
      }
      };
      return gradeDetails;
     }
	public static void main(String[] args) {
	System.out.println("Main method started");
     System.out.println("Enter grade");
     Scanner sc=new Scanner(System.in);
     String grade=sc.next().toUpperCase();
     
     String gradeDetails=gradeDet(grade);
     System.out.println("Grade Details:"+ gradeDetails);
     System.out.println("Main method ended");
	}

}
