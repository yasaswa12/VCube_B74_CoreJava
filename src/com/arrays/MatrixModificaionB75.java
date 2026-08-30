package com.arrays;

public class MatrixModificaionB75 {

	public static void main(String[] args) {
		int [][]arr= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<arr.length;i++) {
			if(i % 2== 0) {
				reveseArr(arr[i]);
			}
			for(int j=0;j<arr[i].length;j++) {
				if(i%2 !=0 && i!=j) {
					arr[i][j]=arr[i][j]*2;
				}
				if(i==j) {
					arr[i][j]=arr[i][j]*arr[i][j];
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}

	}
	static void reveseArr(int [] arr){
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
}
