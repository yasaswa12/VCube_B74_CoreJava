package com.arrays;

public class MinAndMax {

	public static void main(String[] args) {

		int []arr= {10,20,40,50,70};
		int min=arr[0];
		int max=arr[0];
		for(int i = 0; i < arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
			}else if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Min and Max of arr : " + min + " " + max);
	}

}
