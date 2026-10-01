package com.accessmodifiers2;

import com.accesmodifiers1.TestDemo1;

public class TestDemo03 extends TestDemo1{
	TestDemo03(){
		this(10);
		System.out.println("parent");
	}
	
	TestDemo03(int x){
		
		System.out.println("child");
	}

	public static void main(String[] args) {
//		TestDemo1 t1=new TestDemo03();
//		TestDemo03 t3=new TestDemo03();
//		System.out.println(t3.cId);
//		System.out.println(t3.name);
//		t3.method1();
//		System.out.println(t3.getClass());
	}

}
