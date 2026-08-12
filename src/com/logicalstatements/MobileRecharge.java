package com.logicalstatements;

import java.util.Scanner;

public class MobileRecharge {

	public static void main(String[] args) {
     
		System.out.println("Main method strated");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Recharge Plan Amount");
		int rechargePlan=sc.nextInt();
		if(rechargePlan == 199 || rechargePlan == 299 || rechargePlan == 399 || rechargePlan == 499 ) {
			System.out.println("Enter Wallet Balance:");
			int bal=sc.nextInt();
			if(bal >= rechargePlan) {
				System.out.println("Valid Recharge Plan");
				System.out.println("Recharge Successful");
				System.out.println("Remaining Balance= " + (bal-rechargePlan));
			}else {
				System.out.println("In sufficient Balance");
			}
		}else {
			System.out.println("Invalid Pack");
		}
		
	}

}
