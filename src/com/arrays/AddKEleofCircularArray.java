package com.arrays;

public class AddKEleofCircularArray {

	public static void main(String[] args) {
		System.out.println("main method started");
		int arr[]= {5,7,1,4};
		int k=2;
		int arr1[]=addCA(arr,k);
		for(int a:arr1) {
			System.out.print(a+" ");
		}
	}

	private static int[] addCA(int[] arr, int k) {
		int arr1[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<=k;j++) {
				arr1[i]+=arr[(i+j)%arr.length];
			}
		}
		return arr1;
	}

}
