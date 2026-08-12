package com.loops;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your number");
       int n = sc.nextInt();
       binaryToDecimal(n);
	}

	private static void binaryToDecimal(int n) {
      String str = "";
      int r = 0;
      while(n > 0) {
    	  r = n  % 2;
    	  n = n / 2;
    	  str = r + str;
      }
      System.out.println(str);
	}

}
