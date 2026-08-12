package com.languagefundamentals.methods;

import java.util.Scanner;

class Student{
	int m1;
	int m2;
	int m3;
	int m4;
	int m5;
}

public class ResultAnalyzer {
	
	int calculateTotal(Student s) {
		return s.m1+s.m2+s.m3+s.m4+s.m5;
	}
	

	int squareNumber(int num) {
		return num*num;
	}
	public static void main(String[] args) {
     String s1=new String("java11");
     String s2="java11";
     String s3=s1.intern();
     System.out.println(s1==s2);
     System.out.println(s2==s3);
     
     ResultAnalyzer r1=new ResultAnalyzer();
     System.out.println("Square of a number"+r1.squareNumber(5));
     Student stu1=new Student();
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter student 5 subject marks: ");
     stu1.m1=sc.nextInt();
     stu1.m2=sc.nextInt();
     stu1.m3=sc.nextInt();
     stu1.m4=sc.nextInt();
     stu1.m5=sc.nextInt();
     System.out.println("Total marks: "+r1.calculateTotal(stu1));
     System.out.println("Average marks: "+r1.calcAvg(stu1));
     System.out.println("Percentage : "+r1.calcPercentage(stu1));
	}
	double calcAvg(Student s) {
		return calculateTotal(s)/5;
	}
	double calcPercentage(Student s) {
		
		int total = calculateTotal(s);
		
		return (total/500.0)*100 ;
	}
}

