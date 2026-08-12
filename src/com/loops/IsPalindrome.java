package com.loops;

import java.util.Scanner;

public class IsPalindrome {

	public static void main(String[] args) {
    System.out.println("Main method started");
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your number:");
    int num=sc.nextInt();
    
    boolean isPali= isPalindrome(num);
    
    if(isPali)
    	System.out.println("The given number is Palindrome");
    else
    	System.out.println("The given number is not palindrome");
    
    sc.close();
	}

	static boolean isPalindrome(int n) {
		int temp=n;
		int pali=0;
		while(n != 0) {
			pali = pali * 10 + (n % 10);
			n=n/10;
		}
		
	return temp == pali;
	}
}
