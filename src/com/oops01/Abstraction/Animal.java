package com.oops01.Abstraction;

public interface Animal {
	final static String ORG_NAME="vcube";
	public void eat();
	
	public abstract void walk();
	
	abstract void sound();
	
	default void runs() {
		System.out.println("All animals can run");
	}
}
