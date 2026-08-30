package com.arrays;

public class Max_Min_In_Matrix {

	public static void main(String[] args) {

		int[][]arr= {{1,-3,0},{-1,-1,0},{0,0,0}};
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int []a1:arr) {
			for(int a : a1) {
				System.out.print(a +" ");
				if(a<min) {
					min=a;
				}
				 if(a>max) {
					max=a;
				}
			}
			System.out.println();
		}
		System.out.println("Min and Max Elements :" + min +" " + max);
	}

}
