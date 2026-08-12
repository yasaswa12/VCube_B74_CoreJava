package com.loops;

import java.util.Scanner;

public class SumOfDigits {
    static int sumDigi(int num) {
    	int sum=0;
    	for(int i = num; i>0; i=i/10) {
    	sum += num%10;
    	num = num/10; 
    	}
    	
    return sum;
    }
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your number");
      int num=sc.nextInt();
      
      System.out.println("sum= " + sumDigi(num));
	}

}
