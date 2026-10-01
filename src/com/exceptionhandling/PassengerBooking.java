package com.exceptionhandling;

import java.util.Scanner;

public class PassengerBooking {
	static int count=0;
	Passenger arr[]=new Passenger[count];
	public  void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Passenger ID");
		String id=sc.next();
		System.out.println("Enter passenger Age");
		String age=sc.next();
		System.out.println("Enter Seat Number");
		String seatNo=sc.next();
		System.out.println("Enter number of Passengers:");
		int cnt=sc.nextInt();
		
		try {
			int age1=Integer.parseInt(age);
			int id1=Integer.parseInt(id);
		}catch(NumberFormatException ne) {
			System.out.println("Convertion problem");
		}
		
		System.out.println("Enter total Baggage");
		double bagWgt=sc.nextDouble();
		avgBagg(bagWgt);
		Passenger p1=new Passenger("yasaswa","9346654669",true);
		addPassenger(p1);
		
	}
	public void addPassenger(Passenger p) {
		if(count <arr.length) {
			arr[count++]=p;
		}else {
			System.out.println("count limit excedded");
		}
	}
	void avgBagg(double bag) {
		try {
		System.out.println(bag/count);
		}catch(Exception e) {
			System.out.println("in catch Arithmetic exception");
		}
	}
}
