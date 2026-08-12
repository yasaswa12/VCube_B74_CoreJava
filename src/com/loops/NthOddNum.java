package com.loops;

import java.util.Scanner;
//Wap program to find nth odd number
public class NthOddNum {

//	static int nthOdd(int num) {
//		if(num <= 0)return 0;
//		return (2 * num) -1;
//	}
	 
	static int nthOdd(int num) {
		if(num <= 0)return 0;
         int odd=1;
         for(int i = 1; i < num;i++) {
        	 odd += 2;
         }
         return odd;
	}
	public static void main(String[] args) {

		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		System.out.println("nth odd="+ nthOdd(num));
		
		sc.close();
	}

}
