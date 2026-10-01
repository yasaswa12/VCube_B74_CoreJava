package com.oops01.ploymorphism;


class A{
	void main() {
		System.out.println("from A");
	}
}
public class TestDemo5 extends A {
	
	 void main(String[] args) {
		 System.out.println("main method started");
		 A t1=new TestDemo5();
		 t1.main();
	}
//	 @Override
//	 void main() {
//		 System.out.println(" main 1");
//	 }

}
