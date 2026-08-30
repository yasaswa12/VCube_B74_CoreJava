package com.inheritance;

public class PersonalLoan extends LoanImpl {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Radha's Personal Loan Banking System");
		PersonalLoan pl=new PersonalLoan();
		
		String name=pl.getName();
		int age=pl.getAge();
		double salary=pl.getSalary();
		int cibil=pl.getCibil();
		
		if(salary>=900000 && age>=25 &&( cibil>=350 && cibil<=950) ) {
			System.out.println("Basic validation done. ");
			if(pl.isAdharValid() && pl.isPanValid() && pl.isPhoneValid()) {
				System.out.println("Congratulations "+name+" your loan got Approved with Rate of Intrest :"+pl.getROI());
				
			}else {
				System.out.println("Something went wrong");
			}
		}else {
			System.out.println("Your lone got rejected");
		}
		
	}
	 
}
