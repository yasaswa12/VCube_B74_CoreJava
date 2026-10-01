package com.oops01.Abstraction;

public abstract class SmartDevice {
	
	//instance variables
	int deviceId;
	String deviceName;
	public SmartDevice(int deviceId, String deviceName) {
		super();
		this.deviceId = deviceId;
		this.deviceName = deviceName;
	}
	//abstract methods
	abstract void turnOn();
	abstract void turnOff();
	
	//concrete method
	void displayDevice() {
		System.out.println("Device Id : "+ deviceId);
		System.out.println("Device Name : "+ deviceName);
	}
}
class SmartLight extends SmartDevice{

	public SmartLight() {
		super(1, "Smart Light");
		
	}

	@Override
	void turnOn() {
		System.out.println("Smart light turned on");
		
	}

	@Override
	void turnOff() {
		System.out.println("Smart light turned off");
	}

	
	
}
class SmartAC extends SmartDevice{
	
	public SmartAC(int deviceId, String deviceName) {
		super(deviceId, deviceName);
	}
	SmartAC(){
		this(2,"Smart Ac");
	}
	
	@Override
	void turnOff() {
		System.out.println("Smart Ac turned off");
		
	}
	@Override
	void turnOn() {
		System.out.println("Smart AC turned on");
		
	}
}
class SmartFan extends SmartDevice{

	public SmartFan(int deviceId, String deviceName) {
		super(deviceId, deviceName);
	}

	@Override
	void turnOn() {
		System.out.println("Smart Fan turned on");
		
	}

	@Override
	void turnOff() {
		System.out.println("Smart fan turned off");
		
	}
	
}
