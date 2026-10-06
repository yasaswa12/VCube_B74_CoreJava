package com.arrays;

public class FindKthlargestElement {

	public static void main(String[] args) {
		int[]arr= {6,4,3,5};		  
		int k=2;
		//findKthELement(arr,k);
		//usingbubbleSort(arr);
		kthLargest(arr,k);
		for(int a:arr) {
			System.out.print(a+" ");
		}
	
	}

	private static void kthLargest(int[] arr, int k) {
		for(int i=0;i<k;i++) {
			int maxIdx=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[maxIdx])
					maxIdx=j;
			}
			int temp=arr[i];
			arr[i]=arr[maxIdx]; 
			arr[maxIdx]=temp;
			
		}
		System.out.println(arr[k-1]);
	}

	private static void usingbubbleSort(int[] arr) {
		int k=2;
		for(int i=0;i<arr.length;i++) {
			if(i==k) {
				System.out.println(arr[i]);
				break;
			}
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

	private static void findKthELement(int[] arr, int k) {
		int end=arr.length-1;
		int count=0;
		int el=0;
		for(int i=0;i<arr.length;i++) {
			 int largest=0;
			if(count<k) {
			for(int j=0;j<=end;j++) {
				if(arr[j]>arr[largest])
					largest=j;
			}
			el=arr[largest];
			int temp=arr[end];
			arr[end]=arr[largest];
			arr[largest]=temp;
			end--;
			count++;
			}else {
				break;
			}
		}
		System.out.println(el);
	}

}
