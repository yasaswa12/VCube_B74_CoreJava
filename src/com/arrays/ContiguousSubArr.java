package com.arrays;

public class ContiguousSubArr {

	public static void main(String[] args) {

		int []arr= {-5,2,1,-3};
		int maxSum=Integer.MIN_VALUE;
//		for(int i=0;i<arr.length;i++) {
//			int sum=0;
//			for(int j=i;j<arr.length;j++) {
//				sum+=arr[j];
//				if(sum > maxSum) {
//					maxSum=sum;
//				}
//			}
//		}
		// kadens algo
		int sum=0;
		int start=0;
		int ansStart=0;
		int ansEnd=0;
		for(int i = 0;i < arr.length; i++) {
			if(sum == 0) {
				start = i;
			}
			sum += arr[i];
		
			if(sum > maxSum) {
				maxSum=sum;
				ansStart = start;
				ansEnd = i;
			}
			if(sum < 0) {
				sum = 0;
			}
		}
		System.out.println(maxSum);
		//print sub array
		for(int i=ansStart;i<=ansEnd;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
