package com.loops;

import java.util.Scanner;

public class FibonacciRecursive {

	public static void main(String[] args) {
    System.out.println("Enter number of fibonacci series you want:");
    Scanner sc = new Scanner(System .in);
    int num=sc.nextInt();
    if(num <= 0)
    	System.out.println("Invalid input");
    else if(num == 1)
    	System.out.println(" 0 ");
    else {
      System.out.print("0 1 ");
      fibo(num-2,0,1);
    }
	}

	private static void fibo(int i,int n1,int n2) {
		if(i==0) return ;
         System.out.print((n1+n2) +" ");
		fibo(i-1,n2,(n1+n2));
	}

}
