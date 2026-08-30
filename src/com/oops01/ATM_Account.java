package com.oops01;

public class ATM_Account {
	private double balance;
	
	public void deposit(int amount) {
		if(amount>0) {
		this.balance+=amount;
		System.out.println(amount+" credited to your account.Your current Account"
				+ "balance is "+balance);
		}else {
			System.err.println("Deposit amount greater than 0");
		}
	}
	public void withDraw(int amount) {
		if(amount >0) {
			if(amount <= balance) {
				this.balance-=amount;
				System.out.println(amount+" debited to your account. Your current Account"
						+ "balance is "+balance);
			}else {
				System.err.println("Insufficient amount");
			}
		}else {
			System.err.println("Withdraw amount must be greater than 0");
		}
		
	}
	public double checkBalance() {
		return balance;
	}

}
