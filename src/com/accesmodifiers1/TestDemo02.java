package com.accesmodifiers1;

public class TestDemo02 {
	boolean data;
	String name="yasaswa";

	public static void main(String[] args) {
		TestDemo1 t1=new TestDemo1();
		System.out.println(t1.cId);
		System.out.println(t1.name);
		t1.method1();
		System.out.println(t1.getClass());
		TestDemo02 t2=new TestDemo02();
		
		boolean data = false;
		System.out.println(t2.data);
		TestDemo02 t3=null;
		System.out.println(t3.name);
	}

}
