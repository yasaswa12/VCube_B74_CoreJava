package com.exceptionhandling;

public class TestATM {

	public static void main(String[] args) {
		ATMmenu a1=new ATMmenu();
		
		User u1=new User(1,"sudheer",100000);
		a1.addUser(u1);
		//a1.displayUsers();
		
		a1.displayMenu();
		
	}	

}
