package com.javaintroduction;
class Welcome{
	 static Welcome w1=new Welcome();
	 int x=10;
	static {
		System.out.println("static block");
	}
	{
		System.out.println("instance block created");
	}
	public static void main(String [] args) {

     //Welcome w2=new Welcome();
		System.out.println(w1.x);
	}
		
}