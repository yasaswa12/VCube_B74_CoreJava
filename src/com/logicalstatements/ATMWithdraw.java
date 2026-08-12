package com.logicalstatements;

import java.util.Scanner;

public class ATMWithdraw {

	public static void main(String[] args) {

		System.out.println("Enter PIN number :");
		Scanner sc=new Scanner(System.in);
		String pin=sc.next();
		if(pin.length()>4) {
			System.out.println("Invalid PIN");
		}else {
			System.out.println("Enter withdrw limit");
			int limit = sc.nextInt();
			System.out.println("Enter amount to withdraw");
			int am = sc.nextInt();
           if(am > limit) {
        	   System.out.println("Limit exceeded");
           }else {
        	   System.out.println("Enter Account Balance:");
       		   int acc=sc.nextInt();
       		   if(am > acc) {
       			   System.out.println("In sufficient balance");
       		   }else {
       			   System.out.println("PIN Verified \nWithdrawl Successful");
       			   System.out.println("Amount debited = " + am + " Current  account balance= "+ (acc-am));
       		   }
           }
		}
		
			}

}
