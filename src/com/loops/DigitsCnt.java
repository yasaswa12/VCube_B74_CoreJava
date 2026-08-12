package com.loops;

import java.util.Scanner;

public class DigitsCnt {

	public static void main(String[] args) {

		System.out.println("Enter number :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    int digitCnt=cntDigits(n);
	    System.out.println(digitCnt);
	}

	private static int cntDigits(int n) {
		int cnt  = 0;
		while(n > 0) {
		 n = n / 10;
		 cnt++;
		}
		return cnt;
	}

}
