package com.loops;

import java.util.Scanner;

public class EvenInRange {
    
	// WAP to find the even number in given N range
	static void evenNum(int n) {
		System.out.println("Even numbers in given range ( 0 to " + n + ")");
		for(int i = 0; i <= n;i += 2) {
			System.out.print(i + " ");
		}
	}
	public static void main(String[] args) {
    
		System.out.println("Main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		
		evenNum(n);
		sc.close();
	}

}
