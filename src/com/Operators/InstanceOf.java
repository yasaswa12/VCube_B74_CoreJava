package com.Operators;
class A{
	
}
class B extends A{
	
}
public class InstanceOf {

	public static void main(String[] args) {
     Integer i=20;
     System.out.println(i instanceof Integer);
     System.out.println(i instanceof Number);
     System.out.println(i instanceof Object);
     Number num=30;
     System.out.println(num instanceof Integer);
     A a=new A();
     B b=new B();
     A c=new B();//Upcasting
   //  B d=new A(); //CE
     System.out.println("--------------------------");
     System.out.println(a instanceof A);//true
     System.out.println(b instanceof B);//true
     System.out.println(a instanceof B);//false
     System.out.println(b instanceof A);//true 
     System.out.println(c instanceof A);//true
     System.out.println(c instanceof B);//true
	}

}
