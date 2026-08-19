package com.arrays;

public class Arr_3D {

	public static void main(String[] args) {

		int [][][]arr=new int[3][3][3];
		arr[0][0][0]=100;
		arr[0][0][1]=101;
		arr[0][0][2]=102;
		
		arr[1][1][0]=103;
		arr[1][1][1]=104;
		arr[1][1][2]=105;
		
		arr[2][2][0]=106;
		arr[2][2][1]=107;
		arr[2][2][2]=108;
		
		for(int i = 0; i < arr.length; i ++) {
			for(int j = 0; j < arr[i].length; j ++) {
				for(int k = 0; k < arr[i][j].length; k ++) {
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		for(int [][]a1 : arr) {
			for(int []a2 : a1) {
				for(int a3 : a2) {
					System.out.print(a3 + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
