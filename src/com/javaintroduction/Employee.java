package com.javaintroduction;

public class Employee {
	
int empId;
String eName;
float salary;
static String dept="IT";

public static void main(String[] args) {
	//dept="non it";
	//local variables
	int a;
	a=10;
	//String dept="ECE";
	System.out.println(dept);
		Employee e1=new Employee();
		e1.empId=102;
		e1.eName="yasaswa";
		e1.salary=12000867;
		//e1.eName="gopi";
		System.out.println(e1.dept);
		System.out.println(e1.eName);
		e1.eName="gopi";
		e1.empId=103;
		System.out.println(e1.empId);
		System.out.println(e1.eName);
		
		Employee e2=new Employee();
		
		System.out.println(e2.eName);

}

}
