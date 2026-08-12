package com.logicalstatements;

import java.util.Scanner;

public class SwitchRet {

	static String fun(String vari) {
		switch(vari) {
		case "sun"->{
			return "it's Fun day";
		}
		case "mon" ->{
			return "It's is lazy day";
		}
		case "tue","wed","thurs" ->{
			return "It's is working day";
		}
		case "fri" ->{
			return "It's is weekend moode ";
		}
		case"sat"->{
			return "It's weekend";
		}
		default ->{ 
			return "No such day";
		}
	 }
	}
	public static void main(String[] args) {
      System.out.println("Enter your day");
      Scanner sc=new Scanner(System.in);
      String day=sc.next();
      System.out.println(fun(day));
      sc.close();
	}

}
