package com.oops01.Abstraction;

public abstract class AccountAbs {
	AccountAbs(){
		System.out.println("Abstract class constructor invoked");
	}
	static void welcome() {
		System.out.println("Welcome to Account Abstarct");
	}
	abstract void checkBalance();
	//concrete method
	void printRecipt() {
		System.out.println("Printing.....");
	}
}
class Savings extends AccountAbs{

	@Override
	void checkBalance() {
		System.out.println(" Savings Account Balance : 20290");
	}
	@Override
	void printRecipt() {
		System.out.println("From savings");
	}
	
}
class Personal extends AccountAbs{

	@Override
	void checkBalance() {
		System.out.println("Personal Account Balance: 900");
	}
	
}
