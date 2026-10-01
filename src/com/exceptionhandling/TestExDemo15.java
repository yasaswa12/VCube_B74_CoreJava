package com.exceptionhandling;

import java.io.IOException;
import java.util.Scanner;

public class TestExDemo15 {
	//for checkedException it must throws the calling method also where as unchecked Exceptions
	//sometimes we need to throw and sometimes it is not
	static void hello() throws IOException {
		System.out.println("hello");
	}

	public static void main(String[] args) throws Exception  {
		System.out.println("main method started"); 
		hello();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age:");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("you are eligible to watch paradise movie");
		}else {
			throw new ChariException("babu inka kontha kalam agu");
		}
	}

}
