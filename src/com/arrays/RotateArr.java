package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArr {

	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5,6,7,8};
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter pos");
		int pos = sc.nextInt();
		rotateArr(arr,pos);
		System.out.println(Arrays.toString(arr));
	}

	private static void rotateArr(int[] arr,int pos) {

		revArr(arr,0,arr.length-1);
		pos=pos%arr.length;
		revArr(arr,0,pos-1);
		revArr(arr,pos,arr.length-1);
		
	}

	private static void revArr(int[] arr, int start, int end) {
		int temp = 0;
		while(start<end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}

}
