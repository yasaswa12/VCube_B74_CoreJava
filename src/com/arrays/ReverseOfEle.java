package com.arrays;

public class ReverseOfEle {

	public static void main(String[] args) {
		int []arr= {11,12,13,14,15,16};
		//int []arr2=new int[arr.length];
		
		System.out.println("Input");
		for(int a:arr) {
			System.out.print(a+" ");
		}
		
		for(int i=0;i<arr.length;i++) {
			int temp=arr[i];
			int num=0;
			while(temp>0) {
				num=num*10+(temp%10);
				temp=temp/10;
			}
			arr[i]=num;
		}
		System.out.println("\nOutput");
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}

}
