package com.exceptionhandling;

public class User {
	private int accNo;
	private String name;
	private double balance;
	
	public User(int accNo, String name, double balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void display() {
		System.out.println("Accno= "+accNo+" Name= "+name+" balance= "+balance);
	}
}
