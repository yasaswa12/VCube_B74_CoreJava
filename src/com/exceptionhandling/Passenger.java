package com.exceptionhandling;

public class Passenger {
	private String name;
	private String mobile;
	private boolean payment;
	public Passenger(String name, String mobile, boolean payment) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.payment = payment;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public boolean isPayment() {
		return payment;
	}
	public void setPayment(boolean payment) {
		this.payment = payment;
	}
	
}
