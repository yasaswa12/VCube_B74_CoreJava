package com.accesmodifiers1;

public class TestDemo02 {

	public static void main(String[] args) {
		TestDemo1 t1=new TestDemo1();
		System.out.println(t1.cId);
		System.out.println(t1.name);
		t1.method1();
		System.out.println(t1.getClass());
	}

}
