package com.loops;

import java.util.Scanner;

public class ArmstrongNumer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		boolean flag = isArmstrong(n);
		System.out.println(flag);
	}

	private static boolean isArmstrong(int n) {
		//int len = digitCnt(n);
		String n1 = Integer.toString(n);
		int len = n1.length(); 
		int temp = n;
		int sum = 0;
		while(temp > 0) {
			sum += Math.pow(temp % 10,len);
			temp = temp/10;
		}
		if(sum == n)
			return true;
		return false;
	}

	private static int digitCnt(int n) {
		int cnt = 0;
        while(n > 0) {
        	cnt ++;
        	n = n / 10;
        }
		return cnt;
	}

}
