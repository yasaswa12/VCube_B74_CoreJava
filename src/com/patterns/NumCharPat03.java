package com.patterns;

public class NumCharPat03 {

	public static void main(String[] args) {

		int n=6;
		char ch='A';
		for(int i = 1;i <= n;i++) {
			for(int j = 1;j <= i;j++) {
				System.out.print(ch + ""+i );
			}
			ch++;
			System.out.println();
		}
	}

}
