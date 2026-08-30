package com.oops01;

class Student1 implements Cloneable{
	int sid;
	String sname;
	Address address;
	public Student1 (int sid, String sname, Address adress) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.address = adress;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
}
class Address{
	String city;
	public Address(String city) {
		this.city=city;
	}
	
}

public class ShallowCopyDemo1 {

	public static void main(String[] args) throws CloneNotSupportedException{
		
		Address address1=new Address("Banglore");
		Student1 st1=new Student1(101,"Srikanth",address1);
		
		System.out.println(st1.sid);
		System.out.println(st1.sname);
		System.out.println(st1.address.city);
		System.out.println("********************************");
		
		Student1 st2=(Student1)st1.clone();
		
		st2.address.city="Hyderabad";
		System.out.println(st1.sid);
		System.out.println(st1.sname);
		System.out.println(st1.address.city);
		System.out.println("------------------------");
		st2.sname="sri";
		st2.sid=102;
		System.out.println(st2.sid);
		System.out.println(st2.sname);
		System.out.println(st2.address.city);
	}

}
