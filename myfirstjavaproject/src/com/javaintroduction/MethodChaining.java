package com.javaintroduction;

public class MethodChaining {
	static MethodChaining m1=new MethodChaining();
     static void method1() {
    	 System.out.println("method1");
    	 method2();
     }
     static void method2() {
    	 System.out.println("method2");
    	 method3();
     }
     static void method3() {
    	 System.out.println("method3");
    	 m1.method4();
     }
     void method4() {
    	 System.out.println("method4");
    	 method5();
     }
      void method5() {
    	 System.out.println("method5");
    	 method6();
    	 //method2();  	
     }
      void method6() {
    	 System.out.println("method6");
     }
     
	public static void main(String[] args) {
		//method1();
		System.out.println("Addition: " + (10+20));
		
	}

}
