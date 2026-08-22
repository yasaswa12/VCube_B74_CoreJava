package com.patterns;

public class Prac12 {

	public static void main(String[] args) {

		int n=5;
		char ch='A';
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(ch++);
			}
			for(int j=1;j<=n-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
