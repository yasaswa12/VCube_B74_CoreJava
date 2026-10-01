package com.oops01.Abstraction;

public class SavingsAccount implements BankAccount{
	private double balance;
	

	@Override
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
		System.out.println("Deposited Amount : "+ amount);
		}else {
			System.out.println("Invalid deposit amount");
		}
	}

	@Override
	public void withdraw(double amount) {
		if(balance>0 & amount<=balance) {
			balance-=amount;
		System.out.println("Withdrawn Amount: "+amount);
		}else {
			System.out.println("Insufficient amount");
		}
	}

	@Override
	public void checkBalance() {
		System.out.println("Current Balance :"+balance);
	}
	@Override
	public void miniStatement() {
		System.out.println("Savings Account mini statement");
	}
	public static void main(String[] args) {
		System.out.println("Main method started");
		SavingsAccount account=new SavingsAccount();
		account.deposit(1000);
		account.withdraw(2000);
		account.checkBalance();
		account.miniStatement();
		account.accountStatus();
		BankAccount.bankRules();
	}
}
