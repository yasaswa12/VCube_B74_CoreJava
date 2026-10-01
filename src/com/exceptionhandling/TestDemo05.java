package com.exceptionhandling;

public class TestDemo05 {

	public static void main(String[] args) {
		System.out.println("main method started");
		try {
			String s="12o";
			int i=Integer.parseInt(s);
			System.out.println(i*10);
		}
		catch(NumberFormatException n) {
			System.err.println("in ne");
			System.out.println(n.getClass().getSimpleName());
			System.out.println(n.getClass());
			
		}
	}

}
