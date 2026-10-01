package com.exceptionhandling;

public class TestExDemo04 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		try {
		int []arr=new int[4];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		//arr[4]=5;
		for(int i=0;i<=arr.length;i++) {
			System.out.println(arr[i]);
			}
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("in catch ae");
		}catch(IndexOutOfBoundsException i) {
			System.out.println("in catch ie");
		}
		
		System.out.println("main  method ended");
	}

}
