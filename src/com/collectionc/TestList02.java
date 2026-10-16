package com.collectionc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestList02 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("yaasaswa");
		list.add("sudheer");
		list.add("tulasi");
		
		System.out.println(list);
		
		System.out.println("________________________________");
		//for loop
		for(int i=0;i<list.size();i++) {
			System.out.println( list.get(i));
		}
		System.out.println("________________________________");
//		//forEach loop
		for(String i:list) {
			System.out.println(i);
		}
		System.out.println("________________________________");
		//Iterator
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	System.out.println("________________________________");
	//ListIterator
	ListIterator<String> litr=list.listIterator();
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		System.out.println("________________________________");
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println("________________________________");
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		System.out.println("________________________________");
		
	}

}
