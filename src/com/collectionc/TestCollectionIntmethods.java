package com.collectionc;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionIntmethods {

	public static void main(String[] args) {

		System.out.println("main method started");
		//ArrayList is a raw type. 
		//References to generic type ArrayList<E> should be parameterized
		
		Collection<Object> c=new ArrayList<>();
		c.add(10);
		c.add(20);
		c.add("yasaswa");
		System.out.println(c);
		
		Collection<String> boys=new ArrayList<String>();
		boys.add("yaswanth");
		boys.add(null);
		boys.add("srikanth");
		boys.add("sudheer");
		System.out.println(boys);
		
		Collection<String> girls=new ArrayList<>();
		girls.add("yasaswa");
		girls.add("anu");
		girls.add("varsha");
		girls.add("manasa");
		System.out.println(girls);
		
		Collection<String> students=new ArrayList<>();
		students.add("Radha");
		students.addAll(girls);
		students.addAll(boys);
		System.out.println(students);
		
		System.out.println(students.remove(null));
		System.out.println(students);
		System.out.println(students.contains(null));
		System.out.println(students.containsAll(boys));
		System.out.println(students.removeAll(boys));
		System.out.println(students);
		boys.clear();
		System.out.println(boys);
		
	}

}
