package com.oops01.Abstraction;

public class TestSmartDevice {

	public static void main(String[] args) {
//		SmartLight sl=new SmartLight();
//		sl.displayDevice();
//		sl.turnOn();
//		System.out.println("----------------------");
//		SmartAC sac=new SmartAC();
//		sac.displayDevice();
//		sac.turnOn();
//		SmartFan sf=new SmartFan(3, "Smart Fan");
//		sf.displayDevice();
//		sf.turnOn();
		
		SmartDevice []smartDevices= { new SmartLight(),
//				new SmartAC(2,"Ac out"),
				new SmartAC(),
				new SmartFan(3, "Smart Fan")
		};
		for(SmartDevice s: smartDevices) {
			s.displayDevice();
			s.turnOn();
			s.turnOff();
			System.out.println("--------------------------------");
		}
	}

}
