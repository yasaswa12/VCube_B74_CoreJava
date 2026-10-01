package com.oops01.Abstraction;

public abstract class Notification {
	abstract void send() ;
}
class Email extends Notification{

	@Override
	void send() {
		System.out.println("Sending Email...");
	}
	
}
class SMS extends Notification{
	@Override
	void send() {
		System.out.println("Sending SMS...");
	}
}
class Whatsapp extends Notification{
	@Override
	void send() {
		System.out.println("Sending whatsapp message");
	}
}

