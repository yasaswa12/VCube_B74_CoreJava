package com.oops01;

public class ObjectClassMethods {
	ObjectClassMethods(){
		super();
		System.out.println("No arg constructor called");
	}
	protected void finalize() {
		System.out.println("finalize method called");
	}
	
	void welcome() {
		System.out.println("Welcome to the method");
		System.out.println(this.getClass());
	}
	public static void main(String[] args) {
		ObjectClassMethods ob1=new ObjectClassMethods();
		System.out.println(ob1);
		
		ObjectClassMethods ob2=new ObjectClassMethods();
		System.out.println(ob2);
		System.out.println(ob1.equals(ob2));//Comparing object refereences
		
		ObjectClassMethods ob3=new ObjectClassMethods();
		ob3=ob2;
		
		System.out.println(ob3 +" " +ob2);
		System.out.println(ob3.equals(ob2));//true
		System.gc();
		int adress=0x1dbd16a6;
		System.out.println(ob2.hashCode());
		System.out.println(adress);
		System.out.println("--------------");
		System.out.println(ob1.getClass());
		ob2.welcome();
		
	}

}
