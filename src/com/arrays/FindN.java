package com.arrays;

import java.util.Scanner;

public class FindN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array:");
		int n = sc.nextInt();
		System.out.println("Enter array elements");
		int []arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter element to find");
		int x=sc.nextInt();
		int i=findNum(arr,x);
		System.out.println(x + " is present at index " + i);
	}

	private static int findNum(int[] arr, int x) {
		for(int i = 0;i < arr.length ;i++) {
			if(arr[i] == x) {
				return i;
			}
		}
		return -1;
	}

}
