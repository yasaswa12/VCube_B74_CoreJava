package com.logicalstatements;

public class Developer extends Employee {
	

	@Override
	public void calcSalary() {
		System.out.println(super.salary);
	}

	@Override
	public void main(String[] args) {
		System.out.println("from developer");
		Developer d1=new Developer();
		String []arr= new String[2];
		super.main(arr);
	}
//	public static void main(String[]args) {
//		Developer d1=new Developer();
//		d1.calcSalary();
//		Employee e1=new Employee(99.0);
//		d1.calcSalary();
//		d1.calcSalary(6);
//	}

}
