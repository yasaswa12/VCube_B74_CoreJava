package com.constructors;

public class BankAccount {
      int accNo;
      String Name;
      double balance;
      BankAccount(String name,int accNo,double balance){
    	 this.Name=name;
    	 this.accNo=accNo;
    	 this.balance=balance;
      }
      BankAccount(BankAccount ac){
    	  this.Name=ac.Name;
    	  this.accNo=ac.accNo;
    	  this.balance=ac.balance;
      }
      void deposit(double amount) {
    	  balance+=amount;
      }
	public static void main(String[] args) {
     BankAccount ac1=new BankAccount("yasaswa",987564564,50000);
     ac1.info();
     BankAccount ac2=new BankAccount(ac1);
     ac2.info();
     ac2.deposit(500);
     ac2.info();
     ac1.info();
	}
	void info() {
		System.out.println("*********Account Details: ***********");
		System.out.println("Name of the account holder:" + Name);
		System.out.println("account Number:" + accNo);
		System.out.println("Balance:" + balance);
	}

}
