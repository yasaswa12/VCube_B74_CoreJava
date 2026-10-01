package com.oops01.ploymorphism;
import java.util.Scanner;

class Student {
	static Scanner sc=new Scanner(System.in);
	int[]marks;
	void calcGrade() {

	}
	void setMarks() {
		System.out.println("Setting Student marks");
	}
}

class EngStu extends Student{
		@Override
		void calcGrade(){
			System.out.println("welcome to Engineering students Grade System");
		}
		void setMarks(){
			System.out.println("Enter number of subjects");
			int n=sc.nextInt();
			marks=new int [n];
			for(int i=0;i<marks.length;i++) {
				System.out.println("Enter subject"+ (i+1)+"marks");
				marks[i]=sc.nextInt();
			}
		}
	}

class MedStu extends Student {
	@Override
	void calcGrade(){
		System.out.println("welcome to Medical students Grade System");
	}
	void setMarks(){
		System.out.println("Enter number of subjects");
		int n=sc.nextInt();
		marks=new int [n];
		for(int i=0;i<marks.length;i++) {
			System.out.println("Enter subject"+ (i+1)+"marks");
			marks[i]=sc.nextInt();
		}
	}

}

class ManagStu extends Student{
	@Override
	void calcGrade(){
		System.out.println("welcome to Managment students Grade System");
	}
	void setMarks(){
		System.out.println("Enter number of subjects");
		int n=sc.nextInt();
		marks=new int [n];
		for(int i=0;i<marks.length;i++) {
			System.out.println("Enter subject"+ (i+1)+"marks");
			marks[i]=sc.nextInt();
		}
	}

}

public class GradingSystem {

	public static void main(String[] args) {
		Student s1=new EngStu();
		s1.calcGrade();
		((EngStu) s1).setMarks();
		
		Student s2=new MedStu();
		s2.calcGrade();
		s2.setMarks();
		
	}
}
