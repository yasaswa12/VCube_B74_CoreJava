package com.javaintroduction;

public class Objcounter {
	static int count;
	//instance block
	{
		count+=1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Objcounter ob1=new Objcounter();
      Objcounter ob2=new Objcounter();
      Objcounter ob3=new Objcounter();
      System.out.println("count :"+ Objcounter.count);
      
	}

}
