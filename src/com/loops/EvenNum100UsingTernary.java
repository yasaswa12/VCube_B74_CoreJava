package com.loops;

public class EvenNum100UsingTernary {

//	static void printEven(int n) {
//		
//		System.out.println(n + " ");
//		
//		(n<100) ? printEven(n+2) : System.out.println(" ");
//	}
	static int printEven(int n) {

        System.out.print(n + " ");

       return (n < 100) ? printEven(n + 2) : 0;
    }
	public static void main(String[] args) {
    printEven(0);
	}

}
