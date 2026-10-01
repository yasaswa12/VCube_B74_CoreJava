package com.exceptionhandling;

public class TestExDemo02 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		try {
			String s=null;
			System.out.println(s.length());
			String s1="null";
			System.out.println(s1.length());
			String s2="";
			System.out.println(s2.length());
		}catch(Exception e) {
			System.err.println(e.toString());
		}
		
		System.out.println("main method ended");
	}

}
