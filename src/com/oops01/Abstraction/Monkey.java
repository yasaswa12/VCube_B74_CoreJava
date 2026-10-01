package com.oops01.Abstraction;

public class Monkey extends AnimalAbs{

	public static void main(String[] args) {
		Monkey m=new Monkey();
		m.eat();
		m.runs();
		m.walk();

	}

	void extretion() {
		System.out.println("All animals must do process");
	}
//	@Override
//	public void sound() {
//		System.out.println("Monkey sounds like gytrytch");
//		
//	}

}
