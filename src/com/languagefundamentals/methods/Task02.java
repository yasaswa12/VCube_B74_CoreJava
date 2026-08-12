package com.languagefundamentals.methods;
import java.util.*;
public class Task02 {
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
   Task02 t2=new Task02();
		   t2.calculateBill();
    
	}
	void calculateBill() {
		System.out.println("Enter customer Name: ");
		String cName=sc.nextLine();
		System.out.println("Enter no of units consumed");
		int units=sc.nextInt();
		int charge=5;
		System.out.println("---Electicity Bill----");
		System.out.println("customer Name:"+ cName);
		System.out.println("Units consumed:"+ units);
		
		System.out.println("Total Bill:"+ units*charge);
		
	}

}
