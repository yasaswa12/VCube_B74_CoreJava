package com.oops01.Abstraction;

public class NotificationDriver {

	public static void main(String[] args) {
		Notification notifications[]= {
				new Email(), 
				new SMS(),
				new Whatsapp()
		};
		for(Notification n:notifications) {
			n.send();
		}
	}

}
