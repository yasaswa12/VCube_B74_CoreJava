package com.patterns;

public class Prac15 {

	public static void main(String[] args) {

		//int n=5;
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n-i;j++) {
//				System.out.print(" ");
//			}
//			int val=1;
//			for(int j=0;j<=i;j++) {
//				System.out.print(val+" ");
//				val=val*(i-j)/(j+1);
//			}
//			System.out.println();
//		}
		
		//int n=4;
		//int c=3;
		//ncr(n-1,c-1);
//		int n=4;
//		for(int i=1;i<=n;i++) {
//			ncr(n-1,i-1);
//		}
		//int n=5;
		//row(n);
		for(int i=1;i<=5;i++) {
			row(i);
			System.out.println();
		}
	}

	private static void row(int n) {
		int ans=1;
		System.out.print(ans +" ");
      for(int i=1;i<n;i++) {  
    	  ans=ans*(n-i);
    	  ans=ans/i;
    	  System.out.print(ans +" ");
      }
	}

	private static void ncr(int n, int c) {

		int ans=1;
		for(int i=0;i<c;i++) {
			ans=ans*(n-i);
			ans=ans/(i+1);
		} 
		System.out.print(ans+" ");
	}

}
