package com.loops;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {

		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int happyCount=0;
		for(int i = 1; i <= 100 ; i++) {
			if(isHappyNum(i)) {
				System.out.print(i + " ");
				happyCount++;
				if(happyCount % 5 == 0)System.out.println();
			}
				
		}
//		 if(isHappyNum(n))
//			 System.out.println("Happy number");
//		 else
			// System.out.println("Not happy number");
		sc.close();
	}

	private static boolean isHappyNum(int n) {
		int temp=sumOfSqaures(n);
		while( temp >= 10) {
			temp =  sumOfSqaures(temp);	
		}
		return temp == 1 || temp == 7;
	}

	private static int sumOfSqaures(int n) {
		int sum = 0;
		while(n > 0) {
			int r = n % 10;
			sum += r * r;
			n = n / 10;
		}
		return sum;
	}

}
