package com.languagefundamentals.methods;

public class Task01 {
    Integer empNo=101;
	String eName="yasaswa";
	Integer salary=5000;
	Float exp=2.3f;
	String hire="1/07/2026";
	Integer anuSal=12*salary;
	Double anuBonus=(double) (anuSal*(10/100));
	
	
	{
		System.out.println("Emp No : "+ empNo);
		System.out.println("Emp Name : "+ eName);
		System.out.println("Emp Hire Date : "+ hire);
		System.out.println("Emp Annual Salary : "+ anuSal);
		System.out.println("Emp Annual Bonus : "+ anuBonus);
		System.out.println("Emp Tot Salary : "+ (anuSal+anuBonus));
	}

	public static void main(String[] args) {
     Task01 t1=new Task01();
	}

}
