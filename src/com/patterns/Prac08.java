package com.patterns;

public class Prac08 {

	public static void main(String[] args) {

		int n=4;
		int spaces=n-1;
		int stars=1;
		for(int i = 1;i<=2*n-1;i++) {
			for(int j = 1;j<= spaces;j++) {
				System.out.print(" ");
			}
			for(int j = 1;j<=stars;j++) {
				System.out.print("*");
			}
			for(int j = 1;j<=stars;j++) {
				System.out.print("*");
			}
			if(i <n) {
				spaces--;
				stars++;
			}else {
				spaces++;
				stars--;
			}
			System.out.println();
		}
		
	}

}
