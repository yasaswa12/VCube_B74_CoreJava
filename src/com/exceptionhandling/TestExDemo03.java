package com.exceptionhandling;

public class TestExDemo03 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		try {
			System.out.println("in try");
			int x=100/0;
			String s="srikanth";
			System.out.println(s.charAt(x));
		}
		catch(ArithmeticException a) {
			System.err.println("in catch ae");
		}
		catch(IndexOutOfBoundsException se) {
			System.err.println("in ctach se");
		}
		catch(Exception e) {
			System.err.println("in catch e");
		}
		
		System.out.println("main method ended");
	}

}
