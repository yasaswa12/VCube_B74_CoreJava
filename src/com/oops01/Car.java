package com.oops01;

public class Car extends Vehicle{
	void drive() {
		System.out.println("Car starts");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car();
		c1.start();
		c1.drive();
	}

}
