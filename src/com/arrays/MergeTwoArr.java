 package com.arrays;

import java.util.Arrays;

public class MergeTwoArr {

	public static void main(String[] args) {

		int []arr= {2,1,4,6,7};
		
		divide(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void divide(int[] arr) {
       if(arr.length == 1)
    	   return;
       int []left=new int[arr.length/2];
       int [] right=new int[arr.length-left.length];
       int i=0;
       for( i = 0;i< left.length ; i++) {
    	   left[i]=arr[i];
       }
       for(int j = 0;j<right.length ;j++) {
    	   right[j]=arr[i++];
       }
       divide(left);
       
       divide(right);
       merge(arr,left,right);
	}

	private static void merge(int[] arr, int[] left, int[] right) {
		
		int i = 0;
		int j = 0;
		int k = 0;
		while(i < left.length && j< right.length) {
			if(left[i] < right[j]) {
				arr[k++]=left[i++];
			}else {
				arr[k++]=right[j++];
			}
		}
		while(i < left.length) {
			arr[k++]=left[i++];
		}
		while(j< right.length) {
			arr[k++] = right[j++];
		}
	}

}
