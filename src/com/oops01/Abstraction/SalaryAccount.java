package com.oops01.Abstraction;

public class SalaryAccount implements BankAccount {

	@Override
	public void deposit(double amount) {
		System.out.println("Savings account deposit: "+amount);
	}

	@Override
	public void withdraw(double amount) {
		System.out.println("Savings account withddrawl: "+amount);
	}

	@Override
	public void checkBalance() {
		System.out.println("Savings account Balance: 50000");
	}
	public static void main (String []args) {
		System.out.println("Savings account created main method started");
		SalaryAccount account=new SalaryAccount();
		account.deposit(2200);
		account.withdraw(100);
		account.checkBalance();
		BankAccount.bankRules();
	}

}
