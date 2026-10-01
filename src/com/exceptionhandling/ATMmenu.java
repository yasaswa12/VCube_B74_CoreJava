package com.exceptionhandling;

import java.util.Scanner;

public class ATMmenu {
	static Scanner sc=new Scanner(System.in);
	static int choice;
	static int count=0;
	static User users[]=new User[10];
	static User currentUser;
	
	void addUser(User u) {
		if(count < users.length) {
			users[count++]=u;
		}else {
			System.out.println("Users full");
		}
	}
	void displayUsers() {
		for(int i=0;i<count;i++) {
			users[i].display();
		}
	}
	  void displayMenu() {
		  currentUser=isValid();
		do {
			System.out.println("----------------------------");
			System.out.println("ATM Menu:");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3.Withdraw");
			System.out.println("4.Exit");
			System.out.println("Enter your choice");
			try {
			 choice=sc.nextInt();
			if( currentUser!= null) {
			switch(choice) {
			case 1 ->checkBalance(currentUser);
			case 2 ->deposit(currentUser);
			case 3 -> withdraw(currentUser);
			case 4 -> System.out.println("Thank you for using ATM  /n exiting....");
			default ->System.out.println("Enter valid choice");
			}
			}else {
				System.out.println("Invalid user ! Re Enter your details");
			}
			}catch(Exception e) {
				System.out.println("Invalid numeric input");
				sc.nextLine();
				choice=0;
			}
			
		}while(choice != 4);
		
	}

	  private  User isValid() {
		  
		  System.out.println("Enter your Account number: ");
		  int accNo=sc.nextInt();
		  for(int i=0;i<count;i++) {
				if(accNo == users[i].getAccNo()) {	
					return users[i];
				}
			} 
		return null;
	}

	  private  void withdraw(User curentUser) {
	
			System.out.println("Enter amount to withdraw");
			int amount=sc.nextInt();
			
			double balance=curentUser.getBalance();
			if(amount <0) {
				System.out.println("Withdrawl amount can not be negative");
			}else if(amount ==0) {
				System.out.println("Withdrawl amount can not be 0");
			}
			else {
				balance-=amount;
				curentUser.setBalance(balance);
				System.out.println("Amount withdrawl successfully");
				System.out.println(" Current Acc Balance= "+curentUser.getBalance());
			}
				
	}

	  private  void deposit(User curentUser) {
		  System.out.println("Enter amount to deposit");
			int amount=sc.nextInt();
			
			double balance=curentUser.getBalance();
			
			if(amount < 0) {
				System.out.println("Amount can not be negative");
			}else if(amount == 0) {
				System.out.println("Amount can not be 0");
			}
			else {
				balance+=amount;
				curentUser.setBalance(balance);
				System.out.println("Amount deposited successfully");
				System.out.println(" Current Acc Balance= "+curentUser.getBalance());
				}
				
	     }

	  private  void checkBalance(User curentUser) {
			System.out.println("Balance= "+curentUser.getBalance());
		
	  }


}
