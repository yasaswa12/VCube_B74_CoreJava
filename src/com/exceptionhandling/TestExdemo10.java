package com.exceptionhandling;

public class TestExdemo10 {

	public static void main(String[] args) {
		try {
			int []arr= {1,2,3};
			System.out.println(arr[4]);
		}catch(RuntimeException re) {
			System.out.println("in re");
		}catch (Exception e) {
			System.out.println("in e");
		}
	}

}
