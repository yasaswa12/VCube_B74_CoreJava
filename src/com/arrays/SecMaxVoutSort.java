package com.arrays;

import java.util.Scanner;

public class SecMaxVoutSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array:");
		int n = sc.nextInt();
		System.out.println("Enter array elements");
		int []arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		findsecMax(arr);
		
		
	}

	private static void findsecMax(int []arr) {
		int max = arr[0];
		int secMax = Integer.MIN_VALUE;
		for(int i = 1; i < arr.length;i++) {
			if(arr[i] > max) {
				secMax=max;
				max = arr[i];
			}
			 if(arr[i] > secMax && arr[i] != max  ) {
				secMax = arr[i];
			}
		}
		System.out.println("second max=" + secMax);
	}

}
