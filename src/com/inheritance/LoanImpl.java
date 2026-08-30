package com.inheritance;

import java.util.Scanner;

public class LoanImpl implements Loan {
	static Scanner sc=new Scanner(System.in);
	
	public double getROI() {
		int cibil=getCibil();
		double roi=9.0;
		
		if(cibil >=350 && cibil<550) {
			System.out.println("Poor – high risk for lenders");
			return roi+4.0;
		}else if(cibil >= 550 && cibil<= 650) {
			System.out.println("Average – credit may be approved with difficulty");
			return roi+2.0;
		}else if(cibil >=650 && cibil<=750) {
			System.out.println("Good – acceptable to many lenders");
			return roi+1.5;
		}else if( cibil>=750 && cibil<=900) {
			System.out.println("Excellent – high approval chances and better interest rates");
			return roi +0.5;
		}else {
			System.out.println("Contact your cibil score evaluator");
			return 15.0;
		}
	}

	public boolean isPhoneValid() {
		System.out.println("Enter your mobile number");
		String phone=sc.next();
		return phone.matches("^[1-9]{1}[0-9]{9}");
	}
	public boolean isAdharValid() {
		System.out.println("Enter your Adhar number");
		String adhar=sc.next();
		return adhar.matches("^[1-8]{1}[0-9]{11}");
	}
	public boolean isPanValid() {
		System.out.println("Enter your pan number");
		String pan=sc.next();
		return pan.matches("^[A-Z]{5}[0-9]{4}[A-Z]{1}");
	}
	public String getName() {
		System.out.println("Enter your name");
		String name=sc.next();
		return name;
	}
	public double getSalary() {
		System.out.println("Enter your salary");
		double salary=sc.nextDouble();
		return salary;
	}
	public int getAge() {
		System.out.println("Enter your Age");
		int age=sc.nextInt();
		return age;
	}
	public int getCibil() {
		System.out.println("Enter your cibil Score");
		int cibil=sc.nextInt();
		return cibil;
	}
}
