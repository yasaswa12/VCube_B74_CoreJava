package com.loops;

import java.util.Scanner;

public class Neon {
     //A Neon  number is a sum of square of a number is equal to actual number
	// n=9 -> 9*9=81 -> 8+1 = 9 -> 9 == 9
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		if(isNeonNum(n))
		System.out.println("Neon Number");
		else {
			System.out.println("Not neon number");
		}
	}

	private static boolean isNeonNum(int n) {

		int square = n * n;
		int sum = sumOfDigit(square);
		return n == sum;
	}

	private static int sumOfDigit(int n) {
        int sum = 0;
        while(n > 0) {
        	sum += n%10;
        	n = n/10;
        }
		return sum;
	}
}
