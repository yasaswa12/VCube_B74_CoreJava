package com.loops;

import java.util.Scanner;

public class Swap1andLastDigit {

	public static void main(String[] args) {

		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		swap(n);
	}

	private static void swap(int n) {
         if(n < 10) {
        	 System.out.println(n);
        	 return;
         }
         int last = n % 10;
         int first = n;
         int div=1;
         while(first > 10) {
        	 first = first / 10;
        	 div *= 10;
         }
         int middle = (n % div)/10;
         int ans = last * div + middle * 10 + first;
         System.out.println(ans);
         //System.out.println(n);
	}

}
