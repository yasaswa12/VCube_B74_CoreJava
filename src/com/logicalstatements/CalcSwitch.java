package com.logicalstatements;

import java.util.Scanner;

public class CalcSwitch {
//Calculator using switch case
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    double res=0;
    String nextm=" ";
    do {
    	System.out.println("Enter number 1");
    	double num1=sc.nextDouble();
    	System.out.println("Enter number 2");
    	double num2=sc.nextDouble();
    	System.out.println("Enter operator like +,-,/,%");
        char operand=sc.next().charAt(0);
     switch(operand) {
           case '+'-> res=num1+num2;
           case '-'-> res=num1-num2;
           case '/'-> res=num1/num2;
           case '*'-> res=num1*num2;
           case '%'-> res=num1%num2;
           default ->
    	      System.out.println("Invalid");
     }
     System.out.println("Result= "+ res);
     System.out.println("Do you want to continue(y for Yes n for No)");
     nextm=sc.next().toLowerCase();
     
    } while(nextm.equals("y"));
    System.out.println("Exit!!");
    
    sc.close();
	}

}
