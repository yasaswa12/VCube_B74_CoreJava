package com.loops;

import java.util.Scanner;
//WAP to print whether the number is perfect or not ...?
public class PerfectNum {

	static boolean isPerfect(int num) {
		int sum=0;
		if(num == 1)
			return true;
		for(int i = 1;i <= num/2; i++) {
			if(num % i == 0)
				sum += i;
		}
		
		if(sum == num)
			return true;
		return false;
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number:");
       int num=sc.nextInt();
    
    boolean status=isPerfect(num);
    
    if(status) {
    	System.out.println("The given number is perfect !");
    }else {
    	System.out.println("the given number is not perfect");
    }
    
	
    sc.close();
	}
}
