package com.arrays;

import java.util.Arrays;

public class MergerTwoSortedArry {

	public static void main(String[] args) {

		int arr1[]= {1,4,7,8,10};
		int arr2[]= {2,3,9};
		merge(arr1,arr2, arr1.length,arr2.length);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}

	private static void merge(int[] arr1, int[] arr2, int m, int n) {
		int left=m-1;
		int right=0;
		while(left >= 0 && right<n) {
			if(arr1[left]>arr2[right]) {
				int temp=arr1[left];
				arr1[left]=arr2[right];
				arr2[right]=temp;
				left--;
				right++;
			}else {
				break;
			}
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
	}

}
