package com.logicalstatements;
import java.util.Scanner;

public class SwitchDays {
//1--> Sunday
//2--> monday 3->tuesday 4->wednesday 5-> Thursday 6-> friday 7-> sat
	public static void main(String[] args) {
  //  System.out.println("Enter days to print Week Days");
    Scanner sc=new Scanner(System.in);
//    int day=sc.nextInt();
    
//    switch(day) {
//    
//    case 1-> System.out.println("Representing Sunday");
//    case 2-> System.out.println("Representing Monday");
//    case 3-> System.out.println("Representing Tuesday");
//    case 4-> System.out.println("Representing Wednesday");
//    case 5-> System.out.println("Representing Thursday");
//    case 6-> System.out.println("Representing friday");
//    case 7-> System.out.println("Representing saturday");
//    default ->System.out.println("Invalid day");
//    
//    }
    
    System.out.println("Enter day:");
    String day=sc.next().toLowerCase();
    
    switch(day) {
    
    case "sunday" ->System.out.println("Fun day");
    case "monday" ->System.out.println("Lazy day");
    case "tuesday","wednesday","thursday" ->System.out.println("Fun day");
    case "friday" ->System.out.println("Week end mode ");
    case "saturday" ->System.out.println("Weekend day party mode");
    default-> System.out.println("Invalid day");       
    
    }
    
    System.out.println("Main method ended");		
	}

}
