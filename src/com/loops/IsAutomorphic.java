package com.loops;

import java.util.Scanner;

public class IsAutomorphic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		if(isAutomorphic(n)) {
			System.out.println("Automorphic num");
		}else {
			System.out.println("Not automorphic");
		}
		
	}

	private static boolean isAutomorphic(int n) {
        int len = Integer.toString(n).length();
        int div = (int) Math.pow(10, len);
        int square = n * n;
        int rem = square % div;
		return rem == n;
	}

}
