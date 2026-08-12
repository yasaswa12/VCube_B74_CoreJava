package com.loops;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc .nextInt();
		binaryToDecimal(n);
	}

	private static void binaryToDecimal(int n) {
       int num = 0;
       int pow = 0;
       int r = 0;
       while(n > 0) {
    	   r = n % 10;
    	   n = n / 10;
    	   num += (r * Math.pow(2, pow));
    	   pow++;
       }
       System.out.println("Decimal number is:" + num);
	}

}
