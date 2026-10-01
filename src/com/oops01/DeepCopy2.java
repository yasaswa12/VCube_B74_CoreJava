package com.oops01;

 class Student6 {
	int id;
	String name;
	Adress adress;
	public Student6(int id, String name, Adress ad) {
		super();
		this.id = id;
		this.name = name;
		this.adress =ad;
	}
	public Student6(Student6 st) {
		this.id=st.id;
		this.name=st.name;
		this.adress=new Adress(st.adress.city);
	}

}
 class Adress{
	 String city;
//	 Adress(Adress ad){
//		 this.city=ad.city;
//	 }
	 Adress(String city){
		 this.city=city;
	 }
 }

public class DeepCopy2 {

	public static void main(String[] args) throws CloneNotSupportedException{
		Adress ad=new Adress("hyderabad");
	
		
		Student6 s1=new Student6(101,"yasaswa",ad);
		Student6 s2=new Student6(s1);
		s2.id=102;
		s2.name="Sudheer";
		s2.adress.city="banglore";
		System.out.println(s1.id +" "+s1.name+" "+s1.adress.city);
		System.out.println(s2.id +" "+s2.name+" "+s2.adress.city);
	}

}
