package com.arrays;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
       int temp=0;
		int []arr= {1,2,3};
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length-1;i++) {
			boolean flag=false;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}	
			}
			if(!flag)break;
		}
		System.out.println(Arrays.toString(arr));
	}

}
