package com.inheritance;

public class HomeLoan extends LoanImpl {
	@Override
	public double getROI() {
		int cibil=getCibil();
		double roi=5.0;
		
		if(cibil >=350 && cibil<550) {
			System.out.println("Poor – high risk for lenders");
			return roi+3.0;
		}else if(cibil >= 550 && cibil<= 650) {
			System.out.println("Average – credit may be approved with difficulty");
			return roi+1.0;
		}else if(cibil >=650 && cibil<=750) {
			System.out.println("Good – acceptable to many lenders");
			return roi+0.5;
		}else if( cibil>=750 && cibil<=900) {
			System.out.println("Excellent – high approval chances and better interest rates");
			return roi ;
		}else {
			System.out.println("Contact your cibil score evaluator");
			return 15.0;
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Radha's Home Loan Banking System");
		HomeLoan pl=new HomeLoan();
		
		String name=pl.getName();
		int age=pl.getAge();
		double salary=pl.getSalary();
		int cibil=pl.getCibil();
		
		if(salary>=800000 && age>=25 &&( cibil>=350 && cibil<=950) ) {
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
