package com.loops;

import java.util.Scanner;

public class PrimeUptoN {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number up to where you want to print:");
      int num=sc.nextInt();
      for(int i = 0;i <= num; i++) {
    	  if(isPrime(i))
    		  System.out.print(i + " ");
      }
	}

	private static boolean isPrime(int n) {
		if(n == 0 || n == 1)
		return false;
		for(int i = 2;i < n/2; i++) {
			if(n % i ==0)return false;
		}
		return true;
	}

}
