package com.arrays;

public class SpiralMatrix {

	public static void main(String[] args) {
		int [][]arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int top=0;
		int right=arr[0].length-1;
		int bottom=arr.length-1;
		int left=0;
		while(top<=bottom && left<=right) {
			//Top
			for(int i=top;i<=right;i++) {
				System.out.print(arr[top][i]+" ");
			}
			top++;
			//Right
			for(int i=top;i<=bottom;i++) {
				System.out.print(arr[i][right]+" ");
			}
			right--;
			//Bottom
			if(top<=bottom) {
			for(int i=right;i>=left;i--) {
				System.out.print(arr[bottom][i]+" ");
			}
			bottom--;
			}
			//Left
			if(left<=right) {
			for(int i=bottom;i>=top;i--) {
				System.out.print(arr[i][left]+" ");
			}
			left++;
			}
		}
		
	}

}
