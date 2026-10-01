package com.exceptionhandling;

import java.util.Scanner;

public class TestExDemo08 {
	Scanner sc=new Scanner(System.in);
	 void main(String[] args) {
		System.out.println("main method started");
		
		hello();
		System.out.println("main method ended");
	}
	
	 void hello() {
		try {
		System.out.println("in try");
		
		}catch(Exception e) {
			System.out.println("in catch");
		}finally {
			System.out.println("in finally");
			sc.close();
			System.exit(0);
		}
	}
}
