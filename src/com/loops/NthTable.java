package com.loops;

import java.util.Scanner;

public class NthTable {

	public static void main(String[] args) {
          System.out.println("Main  method started");
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter numer to print table");
          int n = sc.nextInt();
          System.out.println("Enter limit upto you want");
          int l=sc.nextInt();
          printTable(n,l);
          
          sc.close();
	}

	private static void printTable(int n, int l) {
		for(int i = 1; i <= l; i++) {
			System.out.println(n + " * " + i + " = " + (n*i));
		}
	}

}
