package com.accessmodifiers2;

class Parent{
	int id;
	String name;
	String no;
	Parent(){
		this(100);
	}
	Parent(int id){
		this(id,"unknown");
		this.id=id;
		
	}
	Parent(int id,String name){
		this(id,name,"9xxxxxxxxx");
		this.id=id;
		this.name=name;
	}
	Parent(int id,String name,String no){
		this.id=id;
		this.name=name;
		this.no=no;
	}
}
//class Child extends Parent{
//	
//}
public class TestDemo04 {

	public static void main(String[] args) {
		Parent p = new Parent(101,"s");
		System.out.println(p.id+" "+p.name+" "+p.no);
		int id=0;
		System.out.println(++id);
	}

}
