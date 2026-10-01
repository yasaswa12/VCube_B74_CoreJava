package com.oops01.Abstraction;

abstract class Vehicle{
	abstract void start();
	abstract void stop();
}
class Car{
	void start() {
		System.out.println("Car starts");
	}
	void stop() {
		System.out.println("Car stops");
	}
}
class Bus{
	void start() {
		System.out.println("Bus starts");
	}
	void stop() {
		System.out.println("Bus stops");
	}
}
public class TestVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
