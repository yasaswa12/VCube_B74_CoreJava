package com.oops01;

public class Student extends Person {
	String collegeName;
	void displayStudent() {
		System.out.println("College Name= "+collegeName);
	}

	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="sudheer";
		s1.age=27;
		s1.collegeName="chirala college";
		
		s1.displayPerson();
		s1.displayStudent();
	}

}
