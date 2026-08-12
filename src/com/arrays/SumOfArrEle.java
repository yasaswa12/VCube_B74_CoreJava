package com.arrays;

public class SumOfArrEle {

	public static void main(String[] args) {

		int arr[]= {10,20,30,40};
		int sum = 0;
		for(int a : arr) {
			sum += a;
		}
		System.out.println("sum of arr elements= " + sum);
		System.out.println("Avg of arr elements= " + sum/arr.length);
	}

}
