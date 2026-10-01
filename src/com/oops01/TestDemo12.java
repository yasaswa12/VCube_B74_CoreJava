package com.oops01;

class Employee12{
	protected double salary=100;
	
	Employee12(double sal){
		this.salary=sal;
	}
	Employee12(){
		
	}
	double calcSal() {
		return salary;
	}
}

class Developer extends Employee12{
	double salary;
	Developer(double sal){
		this.salary=sal;
	}
	@Override
	double calcSal() {
		return this.salary+super.salary;
	}
	
}
class Tester extends Employee12{
	double salary;
	Tester (double sal){
		this.salary=sal;
	}
	@Override
	double calcSal() {
		
		return this.salary+super.salary;
	}
}
class Manager extends Employee12{
	double salary;
	Manager(double sal){
		this.salary=sal;
	}
	@Override
	double calcSal() {
		return this.salary+super.salary;
	}
}
public class TestDemo12 {

	public static void main(String[] args) {

		Employee12 e1=new Employee12(250);
		System.out.println(e1.calcSal());
		Tester t1=new Tester(1200);
		System.out.println(t1.calcSal());
		Manager m1=new Manager(5000);
		System.out.println(m1.calcSal());
		Developer d1=new Developer(1800);
		System.out.println(t1.calcSal());
		
	}

}
