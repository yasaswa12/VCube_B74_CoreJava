package com.oops01;

class Student3{
	int sid;
	String sname;
	Address3 address;
	public Student3(int sid, String sname, Address3 address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.address = address;
	}
	public Student3(Student3 st) {
		this.sid=st.sid;
		this.sname=st.sname;
		this.address=new Address3(st.address);
	}
	public static void main(String[]args) {
		System.out.println("Main method from student");
	}
}

class Address3{
	String city;
	
	public Address3(Address3 ad1){
		this.city=ad1.city;
	}
	public Address3(String city) {
		this.city=city;
	}
}

public class DeepCopyDemo1 {

	public static void main(String[] args) {
		Address3 address=new Address3("Guntur");
		
		Student3 st1=new Student3(101,"vinodh",address);
		
		System.out.println(st1.sid);
		System.out.println(st1.sname);
		System.out.println(st1.address.city);
		System.out.println("-------------------");
		
		Student3 st2=new Student3(st1);
		
		st2.sid=100;
		st2.address.city="vijayawada";
		System.out.println(st1.sid);
		System.out.println(st1.sname);
		System.out.println(st1.address.city);
		System.out.println("-------------------");
		System.out.println(st2.sid);
		System.out.println(st2.sname);
		System.out.println(st2.address.city);
		System.out.println("-------------------");

	}

}
