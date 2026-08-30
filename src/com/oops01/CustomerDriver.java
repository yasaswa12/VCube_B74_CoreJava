package com.oops01;

public class CustomerDriver {

	public static void main(String[] args) {
		Customer c1=new Customer();
		System.out.println(c1.getCustomerId());
		System.out.println(c1.getName());
		System.out.println(c1.getNumber());
		System.out.println(c1.getEmail());
		c1.setCustomerId(101);
		c1.setName("Yasaswa");
		c1.setEmail("yasaswa@1234");
		c1.setNumber(9346654669l);
		
		System.out.println(c1.getCustomerId());
		System.out.println(c1.getName());
		System.out.println(c1.getNumber());
		System.out.println(c1.getEmail());
	}

}
