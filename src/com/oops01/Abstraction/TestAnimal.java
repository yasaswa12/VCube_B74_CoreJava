package com.oops01.Abstraction;

public class TestAnimal {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.eat();
		d.walk();
		d.sound();
		d.runs();
		d.bark();
		System.out.println("--------------------");
		Animal c=new Cat();
		c.eat();
		c.walk();
		c.sound();
		c.runs();
		
	}

}
