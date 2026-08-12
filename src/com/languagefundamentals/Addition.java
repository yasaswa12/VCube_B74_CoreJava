package com.languagefundamentals;

public class Addition {
	
	{
		var a=10.05;
		var b=20.05;
		add(a,b);
	}
   void add(int a,int b) {
	   System.out.println("Adddition with int "+(a+b));
   }
   void add(float a,float b) {
	   System.out.println("Addition with float "+ (a+b));
   }
   void add(double a,double b) {
	   System.out.println("Addition with double "+ (a+b));
   }
	public static void main(String[] args) {
     Addition a1=new Addition();
	}

}
