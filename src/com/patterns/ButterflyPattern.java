package com.patterns;

public class ButterflyPattern {

	public static void main(String[] args) {

		int n=6;
		int spaces=2*n-2;
		for(int i=1;i<=2*n-1;i++) {
			
			for(int j = 1;j<=n-(spaces/2);j++) {
				System.out.print("*");
			}
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int j = 1;j<=n-(spaces/2);j++) {
				System.out.print("*");
			}
			if(i<6) {
				spaces-=2;
			}else {
				spaces+=2;
			}
			System.out.println();
		}
	}

}
