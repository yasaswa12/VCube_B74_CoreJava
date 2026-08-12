package com.Operators;

public class UnaryOpDemo {

	public  UnaryOpDemo(){
		System.out.println("private costructor Called");
	}
	public static void main(String[] args) {
		UnaryOpDemo d1=new UnaryOpDemo();
		
     int a=3;
     int b=2;
     System.out.println(+a);
     System.out.println(-b);
     System.out.println(a+ " "+ b);
     System.out.println(a++);//3
     System.out.println(++a);//5
     System.out.println(--b);//1
     System.out.println(--b);//0
     System.out.println(--b);//-1
     System.out.println(++b);//0
    int result=2147483647;
     System.out.println(++result);
//     System.out.println(2147483647++);
	}

}
class Test{
	Test(){
		System.out.println("Test called");
	}
	UnaryOpDemo d1=new UnaryOpDemo();
	 void main(String[]args) {
		
	}
}
