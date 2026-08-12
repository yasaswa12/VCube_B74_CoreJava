package com.javaintroduction;

public class TestDemo1 {
	int x=10;
	static int y=5;
	{
		System.out.println("instance block called");
		System.out.println(x);
	}
	//TestDemo1 t=new TestDemo1();
	void hello() {
		System.out.println("instance method called");
	}
	static void helloo() {
		System.out.println("static method called");
	}
	static {
		System.out.println("static block called");
	}
	
	public static void main(String[] args) {
		TestDemo1 t=new TestDemo1();
		helloo();
		t.hello();
	}
	
	
	
 
}
