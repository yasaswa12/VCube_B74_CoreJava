package com.collectionc;

import java.util.ArrayList;
import java.util.Collection;

public class TestInterfaceCollection {

	public static void main(String[] args) {
//		Collection<Integer> c1=new ArrayList<>();
//		c1.add(10);
//		c1.add(20);
//		System.out.println(c1.hashCode());
//		
//		Collection<Integer> c2=new ArrayList<>();
//		c2.add(10);
//		c2.add(20);
//		System.out.println(c2.hashCode());
//		System.out.println(c1.equals(c2));
		//System.out.println("BCD".hashCode());
		Collection<String> c1=new ArrayList<>();
		c1.add("A");
		c1.add("B");
		System.out.println(c1.hashCode());
		
		Collection<String> c2=new ArrayList<>();
		c2.add("A");
		c2.add("c");
		System.out.println(c2.hashCode());
		
	}

}
