package com.oops01.ploymorphism;
class  Parent{
//	private Parent(){
//		
//	}
	void show() {
		System.out.println("Parent");
	}
}
class Child extends Parent{
	private Child() {
		
	}
	void display() {
		System.out.println("Child");
	}
}
public class TestDemo4 {
   private TestDemo4() {
	   
   }
	public static void main(String[] args) {
//		Parent p=new Child();
		//Child c= new Child();
//		c.show();
		TestDemo4 t2=new TestDemo4();
	}

}
