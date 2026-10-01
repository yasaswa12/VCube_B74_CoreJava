package com.oops01.Abstraction;

public abstract class AnimalAbs implements Animal {
	public AnimalAbs() {
		System.out.println("Animal abstract class");
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		
	}
	abstract void extretion();
}
