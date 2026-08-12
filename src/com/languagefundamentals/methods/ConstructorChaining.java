package com.languagefundamentals.methods;

public class ConstructorChaining {
	String cllgName;
	String city;
	int totStudents;

	 ConstructorChaining() {
		 this("RGUKT SKLM");
		System.out.println("No arg constructor called");
	}
	 ConstructorChaining(String clgName){
		 this(clgName,"SKLM");
		 System.out.println("one arg constructor");
	 }
	 ConstructorChaining(String clgName, String city){
		 this(clgName,city,50000);
		 System.out.println("Two arg constructor");
	 }
	 ConstructorChaining(String clgName, String city, int totStudents){
		 System.out.println("Three arg constructor");
		 this.cllgName=clgName;
		 this.city=city;
		 this.totStudents=totStudents;
	 }
	 
	public static void main(String[] args) {
		ConstructorChaining c1=new ConstructorChaining();
        c1.show();
        ConstructorChaining c2=new ConstructorChaining("CEC");
        c2.show();
        ConstructorChaining c3=new ConstructorChaining("CEC","chirala");
        c3.show();
        ConstructorChaining c4=new ConstructorChaining("CEC","chirala",1200);
        c4.show();
        
	}
	void show() {
		System.out.println(" ************************* ");
		System.out.println("college Name :" + cllgName);
		System.out.println("college city :" + city);
		System.out.println("Total Students :" + totStudents);
		System.out.println("*********************");
	}

}
