package com.languagefundamentals;

import java.math.BigDecimal;
import java.math.BigInteger;

class dog {
	
}
class Student{}

public class Studentinfo {
	int rollNo;
    String stName;
    int age;
    char ch;
    char section;
    float [] marks=new float[6];
    float percentage;
    boolean isPass;
    char grade;
    // Object data types
    String s="yasaswa";
    StringBuilder s1=new StringBuilder("yamini");
    StringBuffer s2;
    BigDecimal i1=new BigDecimal("123456788882");
    BigDecimal i3=new BigDecimal("12345678809898675653543");

    BigDecimal i2;
    Integer inte;
    Character ch1;
    Double d1;
    Float f1;
    Boolean boo1;
 //   Integer i6=Integer.ValueOf("100");
    Integer i7=8798;
    
	public static void main(String[] args) {
//     int i=127;
//     Integer i1=127;
//     System.out.println(i==i1);
     Studentinfo s1=new Studentinfo();
     System.out.println(s1.i1.multiply(s1.i3));
     
     System.out.println(s1.s1);
     System.out.println(s1.i1);
     System.out.println(s1.d1);
      for(int i=0;i<s1.marks.length;i++) {
    	  s1.marks[i]=i+70;
    	  System.out.println("subject"+i+"marks"+s1.marks[i]);
      }
     System.out.println("rollNo "+ s1.rollNo);
     System.out.println("Student Name "+ s1.stName);
     System.out.println("Student Age "+ s1.age);
     System.out.println(" Section " + s1.section);
     System.out.println("percantage "+ s1.percentage);
     System.out.println("Ispass "+ s1.isPass);
     System.out.println("grade "+ s1.grade);
	}

	
}
