package com.languagefundamentals;

import java.util.Scanner;

public class BankAccountNumberGenerator {
	int accNo=1000;
	String customerName="default";
	
	static Scanner sc=new Scanner(System.in);
	
	double accBal=0.0;
	
	{
		accNo+=1;
	}
	
	void details(BankAccountNumberGenerator obj) {
		System.out.println("Enter user name:");
		obj.customerName=sc.next();
		System.out.println("Deposit minimal balance to create account:");
		obj.accBal=sc.nextDouble();	
	}
	void show(BankAccountNumberGenerator obj) {
		System.out.println("Account Number :" + obj.accNo);
		System.out.println("Account User Name :" + obj. customerName);
		System.out.println("Account Balance :" + obj.accBal);
	}
	public static void main(String[] args) {
		System.out.println("creating accounts");
		BankAccountNumberGenerator u1= new BankAccountNumberGenerator();
		u1.details(u1);
		u1.show(u1);
		
	}

}
