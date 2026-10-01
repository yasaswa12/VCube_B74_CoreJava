package com.oops01.Abstraction;

public class Cat  implements Animal {

	@Override
	public void eat() {
		System.out.println("cat eats milk");
	}

	@Override
	public void walk() {
		System.out.println("cat walks with 4 egs");
	}

	@Override
	public void sound() {
		System.out.println("Cat sounds like meow meow");
	}

}
