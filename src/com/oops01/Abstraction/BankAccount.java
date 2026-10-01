package com.oops01.Abstraction;

public abstract interface BankAccount {
	public static final String BANK_NAME="Yasaswa Bank";
	//Interface can have main method
	public static void main(String[]args) {
		System.out.println("Welcome to Bank Application main interface");
//		BANK_NAME="hgj";
	}
	public abstract void deposit(double amount);
	public void withdraw(double amount);
	void checkBalance();
	
	//default method to provide common or utility behavior
	public default void miniStatement() {
		System.out.println("mini statement generated");
		System.out.println("Bank Name = "+BANK_NAME);
		printMessage();
	}
	public default void accountStatus() {
		System.out.println("Account is Active");
		printMessage();
	}
	 private void printMessage(){
		 System.out.println("--------------------");
		 System.out.println("Thank you for banking with us");
		 System.out.println("--------------------");
	 }
	 //static method
	public static void bankRules() {
		System.out.println("Banking Rules");
		System.out.println("1. Maintain minimum balance");
		System.out.println("2. Never share your pin");
		System.out.println("3. Never share your OTP");	
	}
	
}
