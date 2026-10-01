package com.oops01;

class Shape{
	void area() {
		
	}
	void area(int a,int b) {
		
	}
	
}
class Rectangle extends Shape{
	@Override
	void area(int a,int b) {
		System.out.println("Area="+a*b);
	}
}
public class TestMoldemo1 {

	public static void main(String[] args) {
		
		Rectangle r1=new Rectangle();
		r1.area(10,20);
		
	}

}
