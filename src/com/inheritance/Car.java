package com.inheritance;

public class Car extends Vehicle {
	int speed=100;
	
	@Override
	public void start() {
		System.out.println("Car starts.");
	}
	
	public void display() {
		System.out.println("Car is displaying now.");
	}
//	@Override
//	public void display() {
//		
//		System.out.println("Car travels with the speed of ");
//	}
	public static void main(String[] args) {
		Car c1=new Car();
		c1.display();
		System.out.println(c1.speed);
		c1.start();
		System.out.println("------------------");
		
		Vehicle v1=new Vehicle();
		v1.start();
		System.out.println(v1.speed);
		System.out.println("--------------------");
		
		Vehicle v2=new Car();
		v2.start();
		v2.mine();
		System.out.println(v2.speed);
		System.out.println("----------------------------");
		
//		Car c2=(Car)new Vehicle(); ClassCastException Down casting is not possible.
		
		
		
		//Class Cast Exception--- Run time Exception while down casting improperly type cast
//		Car Cv1=(Car)new Vehicle(); 
//		Cv1.display();
//		System.out.println(Cv1.speed);
		
	}

}
