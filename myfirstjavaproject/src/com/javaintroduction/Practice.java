package com.javaintroduction;

public class Practice {
	
static int x=10;

int y=20;

static void hello() {
	System.out.println("Hello from static method");
}

void Welcome() {
	int s=10;
	System.out.println("Welcome from instance method");
}
	public static void main(String[] args) {
    System.out.println("main metod started");
    Practice p1=new Practice();
    hello();
    p1.Welcome();
    System.out.println("main method ended");
	}
}
