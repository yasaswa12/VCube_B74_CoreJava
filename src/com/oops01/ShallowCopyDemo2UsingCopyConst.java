package com.oops01;

class Student2{
	int sid;
	String sname;
	Address2 address;
	public Student2(int sid, String sname, Address2 address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.address = address;
	}
	public Student2(Student2 st) {
		this.sid=st.sid;
		this.sname=st.sname;
		this.address=st.address;
	}
	
}

class Address2{
	String city;
	public Address2(String city) {
		this.city=city;
	}
}

public class ShallowCopyDemo2UsingCopyConst {

	public static void main(String[] args) {
		Address2 address=new Address2("Guntur");
		
		Student2 st1=new Student2(101,"vinodh",address);
		
		System.out.println(st1.sid);
		System.out.println(st1.sname);
		System.out.println(st1.address.city);
		System.out.println("-------------------");
		
		Student2 st2=new Student2(st1);
		
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
