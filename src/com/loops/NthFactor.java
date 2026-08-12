package com.loops;

import java.util.Scanner;

public class NthFactor {
    //WAP to find the 3rd factor of a number
	
	static int thirdFactor(int n) {
		int cnt = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				cnt++;
				if(cnt == 3)
					return i;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
     
		System.out.println("Enter your number:");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		
		System.out.println("Third factor of a number:" + thirdFactor(num));
		sc.close();
	}

}
