package com.oops01;

public class Customer {
	private int customerId;
	private String name;
	private long number;
	private String email;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length()==0) {
			System.err.println("name can not be empty");
		}else {
			this.name = name;
		}
		
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		if(String.valueOf(number).length()== 10) {
			this.number = number;
		}else {
			System.err.println("mobile number must be 10 digits");
		}
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email.contains("@")) {
			this.email = email;
		}else {
			System.err.println("Email must contain special character ( @ )");
		}
		
	}
	

}
