package com.oops01;

public class ATM_AccountHolders {

	public static void main(String[] args) {
		ATM_Account u1=new ATM_Account();
		
		System.out.println(u1.checkBalance());
		u1.withDraw(100);
		u1.deposit(0);
		System.out.println();
		
	}

}
