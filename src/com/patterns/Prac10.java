package com.patterns;

public class Prac10 {

	public static void main(String[] args) {

		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==1 || j==0 || i==n ||j==n ||i==j) {
					System.out.print("*");
				}else
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
