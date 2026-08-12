package com.loops;

import java.util.Scanner;

public class NthPrime {

	public static void main(String[] args) {
      
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to print nth prime");
		int n=sc.nextInt();
		
		System.out.println(nthPrime(n));
		sc.close();
		
	}

	private static int nthPrime(int n) {
	   if(n == 1)return 2;
	   int cnt =1;
	   int i = 3;
	   while( cnt < n) {
		   if(isPrime(i))
			   cnt++;
			i += 2;
	   }
	   return i-2;
	} 
  

	private static boolean isPrime(int n){
		if(n<2)return false;
		if(n == 2)return true;
		for(int i =3; i*i <= n;  i+= 2) {
			if(n % i == 0)
			return false;
		}
    return true;
	}
    
//	private static int nthPrime(int n) {
//		int i = 2;
//		int cnt = 0;
//		while(cnt != n) {
//		if(isPrime(i)) {
//			cnt++;
//		}
//		i++;
//		}
//		return i-1;
//	}

//	private static boolean isPrime(int n) {
//		for(int i = 2; i < n;i++) {
//			if(n % i ==  0)
//				return false;
//		}
//
//		return true;
//	}

}
