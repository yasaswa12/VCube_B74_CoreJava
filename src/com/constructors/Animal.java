package com.constructors;

public class Animal {
	String name;
	int age;
    int legs;
    Animal(){
    	System.out.println("Animal no arg constructor called");
    }
	Animal(String name, int age, int legs){
		System.out.println("Animal arg constructor");
		this.name=name;
		this.age=age;
		this.legs=legs;
	}

	public static void main(String[] args) {
    System.out.println("Main from animal");
	}
	void info() {
		System.out.println(" **************** ");
		System.out.println("Animal Name:"+ name);
		System.out.println("Animal age:"+ age);
		System.out.println("Animal legs:"+ legs);
	}

}

 class Dog extends Animal{
	 String breed;
	 Dog(){
		 this("yasaswa",20,2,"human");
		 System.out.println("Dog no arg invoked");
	 }
	 Dog(String name ,int age,int legs,String breed){
		 super(name,age,legs);
		 System.out.println("Dog  arg constructor");
		 this.breed=breed;
	 }

	public static void main(String[] args) {
    System.out.println("Main from dog");
//     Dog d1= new Dog("dogy",4,3,"rols");
//     d1.info();
    Dog d2=new Dog();
    d2.info();
	}
	void info() {
		super.info();
		System.out.println("Dog breed : "+ breed);
	}

}
