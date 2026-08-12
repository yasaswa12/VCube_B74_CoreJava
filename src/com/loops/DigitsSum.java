package com.loops;

import java.util.Scanner;

public class DigitsSum {

	public static void main(String[] args) {

		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = digitSum(n);
		System.out.println(sum);	
		sc.close();
		
	}

	private static int digitSum(int n) {
        int sum = 0;
        while(n > 0) {
        	sum += n % 10;
        	n = n / 10;
        }
		return sum;
	}

}
