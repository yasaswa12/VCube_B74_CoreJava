package com.loops;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialNum {

//	static long fact(long num) {
//		long facto=1;
//		if(num == 0 || num == 1) {
//			return 1;
//		}
//		for(long i = 1; i <= num; i++) {
//			facto *=i;
//		}
//		return facto;
//	}
	 static BigInteger fact(int num) {
		 BigInteger fact=BigInteger.ONE;
		 for(int i = 1; i <= num; i++) {
			 fact=fact.multiply(BigInteger.valueOf(i));
		 }
		 return fact;
	 }
	public static void main(String[] args) {
		System.out.println("Main method started");
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your number:");
       int num=sc.nextInt(); 
       System.out.println("Factorial of a given number:" + fact(num));
     sc.close(); 
     
	}

}
