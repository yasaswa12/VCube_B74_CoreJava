package com.arrays;

public class Sub2Arr {
//input arr1={1,2,8} arr2={4,5,6} 
	//output arr3={1,2,2}
	public static void main(String[] args) {

		int []arr1= {1,5,6};
		int []arr2= {2,4,6};
		int n=Math.max(arr1.length,arr2.length);
		int[]arr3=new int[n];
		
		for(int i=0;i<n;i++) {
			int a= (i<arr1.length) ? arr1[i] : 0;
			int b= (i<arr2.length) ? arr2[i] : 0;
			int diff=a-b;
			if(diff<=0) {
				arr3[i]=arr1[i];
			}else {
				arr3[i]=diff;
			}
		}
		
		for(int a:arr3) {
			System.out.println(a);
		}
	}

}
