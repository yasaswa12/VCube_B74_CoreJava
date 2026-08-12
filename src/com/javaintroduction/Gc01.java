package com.javaintroduction;
class A{
	B b;
	@Override
	protected void finalize() throws Throwable {
	   System.out.println("finalize block called from A");
	}
}
class B{
	A a;
	@Override
	protected void finalize() throws Throwable {
	   System.out.println("finalize block called from B");
	}
}


public class Gc01 {

	void hello() {
	
	Gc01 gc1=new Gc01();//object insisde the method
	System.out.println("helelo");
	}
	void welcome() {
		System.out.println("Welcome called");
	}
	@Override
	protected void finalize() throws Throwable {
	   System.out.println("finalize block called");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     Gc01 gc1=new Gc01();
		     Gc01 gc2=new Gc01();
		     Gc01 gc3=new Gc01();
		     System.out.println(gc1);//2b2fa4f7
		     System.out.println(gc2);//1dbd16a6
		     System.out.println(gc3);//7ad041f3
		     System.out.println(gc1.hashCode());//return integer value of hexa 
		     
		     gc1=null;//nullifying the object
		     gc2.welcome();
		     
		     gc2=gc3;//reassigning the object
		     System.out.println();
		
		     System.out.println(gc1);
		     System.out.println(gc2);
		     System.out.println(gc3);
		     new Gc01().hello();//anonymous object
		     
		     System.out.println("-------------------------");
		     A ob1=new A();
		     B ob2=new B();
		     ob1.b=ob2;
		     ob2.a=ob1;
		     ob1=null;
		     ob2=null;
		     System.gc();
		     
	}

}
