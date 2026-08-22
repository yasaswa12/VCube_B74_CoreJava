package com.patterns;

public class Prac06 {

	public static void main(String[] args) {

		int n=4;
		int stars=1;
		for(int i=1;i<2*n;i++) {
			for(int j=1;j<=stars;j++) {
				System.out.print("*");
			}
			if(i<n) {
				stars++;
			}else {
				stars--;
			}
			System.out.println();
		}
	}

}
