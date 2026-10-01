package com.exceptionhandling;

public class Magazine {
	void hello() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		Object obj=new Object();
		try {
			Magazine mg= (Magazine) obj;
			mg.hello();
		}catch(ClassCastException c) {
			System.out.println(c.toString());
			System.out.println(c.getMessage());
			c.printStackTrace();
			
		}
		
	}

}
