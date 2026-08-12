package com.arrays;

public class Combine2Arr {

	public static void main(String[] args) {

		int []arr1= {1,2,3,4};
		int []arr2= {6,5,7,5,6};
		int[]arr3=new int[arr1.length+arr2.length];
		for(int i=0;i<Math.max(arr1.length,arr2.length);i++) {
			if(i<arr1.length)
			arr3[i]=arr1[i];
			if(i<arr2.length)
			arr3[i+arr1.length]=arr2[i];
		}
		for(int a:arr3) {
			System.out.print(a + " ");
		}
	}

}
