package com.oops01.Abstraction;

public class AccountDriver01 {

	public static void main(String[] args) {
		AccountAbs s1=new Savings();
		Personal p1=new Personal();
		s1.checkBalance();
		p1.printRecipt();
		s1.welcome();
		AccountAbs.welcome();
	}

}
