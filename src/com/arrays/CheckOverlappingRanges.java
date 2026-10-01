package com.arrays;

public class CheckOverlappingRanges {

	public static void main(String[] args) {
		int [][]arr= {{1,6},{2,3},{3,3},{1,8}};
		checkLappinRanges(arr);
	}

	private static void checkLappinRanges(int[][] arr) {
		for(int i=0;i<arr.length-1;i++) {
//			int len1=arr[i].length;
//			int len2=arr[i+1].length;
			if(arr[i][0]<=arr[i+1][0] && arr[i][1]>=arr[i+1][1]) {
				System.out.print(1);
			}else {
				System.out.print(0);
			}
		}
		System.out.println(0);
	}

}
