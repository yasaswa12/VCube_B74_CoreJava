package com.oops01.Abstraction;



public class CalcMain {

	public static void main(String[] args)  {
		//Anonymous object and class creation
		Calculation add=new Calculation() {
			public int calc(int a,int b) {
				return a+b;
			}
		};
		Calculation sub=new Calculation() {
			public int calc(int a,int b) {
				return a-b;
			}
		};
		System.out.println(add.calc(10, 5));
		System.out.println(sub.calc(10, 5));
		//lamda Expression
		Calculation add1= (x,b) -> x+b;
		Calculation sub1=(a,b) ->a-b;
		System.out.println(add1.calc(10, 20));
		System.out.println(sub1.calc(10, 20));
		
	}

}
