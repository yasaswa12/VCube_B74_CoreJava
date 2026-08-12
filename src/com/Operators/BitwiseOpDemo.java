package com.Operators;

public class BitwiseOpDemo {

	public static void main(String[] args) {
    int number=500;
    if(number>=100 && number<=999) {
    	System.out.println("Number is between 100 & 999");
    }
    else {
    	System.out.println("Number out of range");
    }
    System.out.println(87 & 49);
    System.out.println(87|49);
    System.out.println(1^0);
    System.out.println(1^1);
    int a=8;
    System.out.println(a<<1);
    System.out.println(a>>1);
    System.out.println(a>>>1);
    System.out.println(a>>2);
    int num=5;
    String isEven=(num%2==0)? "True":"false";
    System.out.println("Is even number:"+ isEven);
	}

}
