package com.oops01.ploymorphism;

public class TesstDemo2 {

	 void main(String[] args) {
		add();
		add(1.2f,2);
	}

	 private void add() {
		System.out.println("Add with no args");
	 }
//	 void add(int a,int b) {
//		 System.out.println("add int int");
//	 }
//	 void add(float a,int b) {
//		 System.out.println("add float int");
//	 }
	 void add(float a,float b) {
		 System.out.println("add float float ");
		
	 }
	 void add(int a,float b) {
		 System.out.println("add int float ");
		
	 }
	
	 
}
