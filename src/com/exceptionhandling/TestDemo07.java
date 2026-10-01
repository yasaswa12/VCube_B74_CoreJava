package com.exceptionhandling;

public class TestDemo07 {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println(hello());
		System.out.println("main method ended");
	}
	static int hello() {
		try {
			System.out.println(10/0);
			return 5;
			
		}catch(Exception e) {
			return 10;
		}finally {
			return 100;
		}
	}

}
