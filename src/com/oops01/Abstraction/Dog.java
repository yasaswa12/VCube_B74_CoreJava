package com.oops01.Abstraction;

public class Dog implements Animal {
	@Override
	public void eat() {
		System.out.println("Dog eats mostlt non veg");
	}
	@Override
	public void walk() {
		System.out.println("Dog walks and runs");
	}
	@Override
	public void sound() {
		System.out.println("Dog sounds like bow bow");
	}
	void bark() {
		System.out.println("Dog only barks at night loudly..");
	}
	@Override
	 public void runs() {
	 System.out.println("runs........");
	 }
}
abstract class Anim{
	abstract void bark();
}
