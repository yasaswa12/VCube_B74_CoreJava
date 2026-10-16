package com.collectionc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main() {
//		Collection<Integer> c=List.of(1,2,3);
//		//c.add(4);
//		System.out.println(c);
//		Collection <Integer>c1=new ArrayList<>(List.of(1,2,3,2));
//		c1.remove(2);
//		System.out.println(c1);//1,3,2
//		
//		Iterator<Integer> it=c1.iterator();
//		while(it.hasNext()) {
//			if(it.next()==2) {
//				it.remove();
//			}
//		}
//		System.out.println(c1); 
//		Collection<Integer> c=new ArrayList<>();
//		c.add(1);
//		c.add(1);
//		c.add(2);
//		c.add(3);
//		c.removeIf(n -> n>1);
//		System.out.println(c);
		Collection <Integer>c=new ArrayList<>(List.of(1,2,3));
		for(int n:c) {
			if(n==2)c.remove(n);
		}
		System.out.println(c);
		
		
	}
}
