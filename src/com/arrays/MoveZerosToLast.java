package com.arrays;

public class MoveZerosToLast {

	public static void main(String[] args) {
     int []arr= {0,0,0,10,30,0};
     int pos=0;
     for(int i=0;i<arr.length;i++) {
    	 if(arr[i] !=  0) {
    		 swap(i,pos,arr);
    		 pos++;
    	 }
     }
     for(int a:arr) {
    	 System.out.print(a + " ");
     }
     
	}

	private static void swap(int i, int pos, int[] arr) {
		int temp=arr[i];
		arr[i]=arr[pos];
		arr[pos]=temp;
	}
}
