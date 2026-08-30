package com.arrays;

public class SumOfEleIn2DArr {

	public static void main(String[] args) {

		int [][]arr= {{1,2,3},{4,5,6}};
		int sum = 0;
		for(int a1[]:arr) {
			for(int a:a1) {
				sum += a;
			}
		}
		System.out.println("Sum of all  Elements in array: " + sum);
	}

}
