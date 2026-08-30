package com.oops01;

public class EmpDriver {

	public static void main(String[] args) {

		Employee e1=new Employee();
		e1.setEid(101);
		e1.setEname("yasaswa");
		e1.setSalary(1000000);
		System.out.println(e1.getEid());
		System.out.println(e1.getEname());
		System.out.println(e1.getSalary());
		Employee e2=new Employee();
		e2.setEid(102);
		e2.setEname("sudheer");
		e2.setSalary(1000000);
		System.out.println(e2.getEid());
		System.out.println(e2.getEname());
		System.out.println(e2.getSalary());
	}

}
