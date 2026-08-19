package com.arrays;

import java.util.Arrays;

public class MergeTwoSortArrToOneArr {

	public static void main(String[] args) {

		int []arr1= {1,2,3,6,0,0};
		int []arr2= {4,5};
		merge(arr1,arr2,4,2);
		System.out.println(Arrays.toString(arr1));
	}

	private static void merge(int[] arr1, int[] arr2,int m,int n) {

		int i=m-1;
		int j=n-1;
		int k=m+n-1;
		while(i >= 0 && j >= 0) {
			if(arr1[i] > arr2[j]) {
				arr1[k--]=arr1[i--];
			}else {
				arr1[k--]=arr2[j--];
			}
		}
		while(j >= 0) {
			arr1[k--]=arr2[j--];
		}
	}

}
