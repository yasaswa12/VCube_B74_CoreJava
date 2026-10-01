package com.logicalstatements;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
//import java.lang.

public class Employee {
	double salary=100;
	ArrayList arr=new ArrayList<>();
	
	//OutputStream out=new FileOutputStream("Employee.java");
	//PrintStream out1 = new PrintStream(out);
	
	static  PrintStream out1 = System.out;
			//new PrintStream(OutputStream out);
	
	Employee(double sal){
		this.salary=sal;
	}
	Employee(){
		
	}
	
		public void  calcSalary() {
			System.out.println("Salary= "+salary);
		}
		public void calcSalary(double bonus) {
			salary=salary+(bonus/100)*salary;
			System.out.println("Salary= "+salary);
		}
	public  void main(String[] args) {
		System.out.println("From main method emp");
		//System.out.println());
		//System.out.println(out);
		out1.print("yasaswa");
		
	}
	

}
