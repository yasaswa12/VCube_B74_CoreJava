package com.constructors;

public class Constructors {
	int sid;
	String sname;
	int yearofStudy;
	char sec;
	float perc;
	Constructors(){
		System.out.println("No arg constructor called");
	}
	Constructors(int sid){
		System.out.println("parametrized constructor called");
	     this.sid=sid;
	}
	Constructors(int sid,String name){
		System.out.println("parametrized constructor2 called");
	     this.sid=sid;
	     this.sname=name;
	}
	Constructors(int id,String name,int yop){
		System.out.println("parametrized constructor3 called");
	     sid=id;
	     sname=name;
	     yearofStudy=yop;
	}
	Constructors(int id,String name,int yop,char section){
		System.out.println("parametrized constructor4 called");
	     sid=id;
	     sname=name;
	     yearofStudy=yop;
	     sec=section;
	}
	Constructors(int id,String name,int yop,char section,float percentage){
		System.out.println("parametrized constructor5 called");
	     sid=id;
	     sname=name;
	     yearofStudy=yop;
	     sec=section;
	     perc=percentage;
	}

	public static void main(String[] args) {
		Constructors c1=new Constructors();
		Constructors c2=new Constructors(210612);
		c2.show();
		Constructors c3=new Constructors(210612,"yasaswa");
		c3.show();
		Constructors c4=new Constructors(210612,"yasaswa",2027);
		c4.show();
		Constructors c5=new Constructors(210612,"yasaswa",2027,'E');
		c5.show();
		Constructors c6=new Constructors(210612,"sudheer",2027,'E',77);
		c6.show();
	}
	void show() {
		System.out.println("\nDetails are : \n sid: "+ sid +"\n sname: "+sname +"\n year : "+ yearofStudy +"\n sec: "+ sec + "\n perc: "+perc);
	}

}
