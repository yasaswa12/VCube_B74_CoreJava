package com.logicalstatements;
import java.util.Scanner;
public class TestlsDemo2 {
//WAP to find the given name can add to the pan Details?
	//if name length <=15
	public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter your full name:");
  String name=sc.nextLine();
  
  if(name.length()>15) {
	  System.out.println("Your name is too lengthy, give it as short");
  }else {
	  System.out.println("Your name is adding to PAN card");
  }
	}

}
