package com.collectionc;

import java.util.ArrayList;
import java.util.List;

public class TestList01 {

	public static void main(String[] args) {
		List<Object> li=new ArrayList<>();
		li.add(10);
		li.add(10.7);
		li.add("yasaswa");
		li.add('A');
		//System.out.println(li);
		
		List<Integer> list=new ArrayList<>();
		System.out.println(list.size());
		//list.add(2,30); --> IndexOutOfBoundsException
		list.add(0,100);
		list.add(10);
		list.add(20);
		list.add(40);
		//list.add(10,200); IndexOutOfBoundsException
		list.set(1, 200);
		System.out.println(list.get(1));
		
		System.out.println(list);
	}

}
