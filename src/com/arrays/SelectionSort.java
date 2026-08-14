package com.arrays;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int []arr= {1,2,3};
		int temp=0;
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length-1;i++) {
			int minIdx=i;
			boolean flag=false;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[minIdx]>arr[j]) { 
					minIdx=j;
					flag=true;
				}
			   }
			if(!flag)break;
				temp=arr[minIdx];
				arr[minIdx]=arr[i];
				arr[i]=temp;
			}
		System.out.println(Arrays.toString(arr));
}

}
