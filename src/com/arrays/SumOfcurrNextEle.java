package com.arrays;

public class SumOfcurrNextEle {

	public static void main(String[] args) {
		int []arr={10,20,30,40};
		int[]result=new int[arr.length];
		System.out.println("Input");
		for(int a:arr) {
			System.out.print(a+" ");
		}
		for(int i=0;i<arr.length-1;i++) {
			result[i]=arr[i]+arr[i+1];
		}
		result[arr.length-1]=arr[arr.length-1];
		
		System.out.println(" \nOutput");
		for(int a:result) {
			System.out.print(a+" ");
		}
	}

}
