package com.oops01;

public class Person {
	String name;
	int age;
	void displayPerson() {
		System.out.println("Name= "+name);
		System.out.println("Age= "+age);
	}
	public static void main(String[] args) {
		Person p1=new Person();
		p1.name="yasaswa";
		p1.age=20;
		p1.displayPerson();
		}
}
