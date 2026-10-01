package com.exceptionhandling;

public class TestExDemo06 {

	public static void main(String[] args) {
		System.out.println(0.0/0.0);
		System.out.println(0.0/0);
//		try {
//			int x=10/0;
//		}finally { 
//			System.out.println("finally");
//		}
//		try {
//			throw new RuntimeException("a");
//		}
//		catch(Exception e){
//			System.out.println("e");
//		}
//		finally {
//		
//			System.out.println("finally");
//		}
	//	System.out.println("main method ended");
		class AgeException extends RuntimeException{
			AgeException(){
				super();
			}
		}
		try {
			System.out.println("a");
			throw new AgeException();
		}catch (Exception e) {
			e.printStackTrace();
		}
	} 

}
