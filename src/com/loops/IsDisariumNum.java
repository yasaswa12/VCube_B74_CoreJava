package com.loops;

import java.util.Scanner;

public class IsDisariumNum {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		if(isDisarium(n)) {
			System.out.println("Given number is disarium number");
		}else {
			System.out.println("Not disarium number");
		}
	}

	private static boolean isDisarium(int n) {
		int temp = n;
		int len = String.valueOf(n).length();
		//int len = Integer.parseString(n).length();
		int sum = 0;
		while(len > 0) {
			int r = temp%10;
			sum += Math.pow(r, len);
			len --;
			temp = temp/10;
		}
		return n == sum;
	}

}
