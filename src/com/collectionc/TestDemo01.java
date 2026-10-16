package com.collectionc;

import java.util.ArrayList;
import java.util.Collection;

public class TestDemo01 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Collection<Integer> li=new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(40);
		
		System.out.println(li);
		//for each loop
		for(Integer ir:li) {
			System.out.println(ir);
		}
	}

}
