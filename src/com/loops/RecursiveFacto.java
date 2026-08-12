package com.loops;

import java.util.Scanner;

public class RecursiveFacto {

	public static void main(String[] args) {
     System.out.println("Enter number to calculate factorial:");
     Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
     
     System.out.println(fact(num));
	}

	private static int fact(int num) {
        if(num == 0 || num == 1)return 1;
		return num*fact(num-1);
	}

}
