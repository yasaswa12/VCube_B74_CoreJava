package com.accesmodifiers1;

public class TestDemo1 {
	 protected int cId;
	 protected String name;
	  protected TestDemo1() {
		System.out.println("No arg constructor");
	}
	  static{
		  System.out.println("Static block called from TD1");
	  }
	  {
		  System.out.println("Instance block called form TD1");
	  }
	
    protected void method1() {
    	System.out.println("from method 1");
    }
    
	public static void main(String[] args) {
		TestDemo1 t1=new TestDemo1();
		System.out.println(t1.cId);
		System.out.println(t1.name);
		t1.method1();
	}

}
