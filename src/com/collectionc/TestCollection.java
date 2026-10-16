package com.collectionc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestCollection {

	public static void main(String[] args) {
		Collection<Integer> c1=new ArrayList<>();
		c1.add(10);
		c1.add(20);
		c1.add(30);
		c1.add(40);
		
//		for(int i:c1) {
////			if(i==20) {
////				c1.remove(i);
////			}
////			System.out.println(i);
//		}
//		System.out.println("************************");
//		Iterator<Integer> itr=c1.iterator();
//		while(itr.hasNext()) {
//			itr.remove();
//		int j=itr.next();
//		if(j==20) {
//			
//			itr.remove();
//			//c1.remove(j);--->ConcurrentModificationException
//		}
//		}
//		System.out.println(c1);
		
		
//		Iterator<Integer> itr=c1.iterator();
//		while(itr.hasNext()) {
//			
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//			
			
//		}
		List<Integer>list=new ArrayList<>(Arrays.asList(10,20,30));
//		Iterator<Integer> itr=list.iterator();
//		System.out.println(itr.hasNext());
//		System.out.println(itr.hasNext());
//		System.out.println(itr.next());
		Integer[] obj=(Integer[]) list.toArray();
		for(Object o:obj) {
			System.out.println(o);
		}
		System.out.println(obj);
//		Integer[]arr= {10,20,30};
//		//List<Integer> list1=Arrays.asList(arr); -->unsupportedOperationException
//		//List<Integer>list1=new ArrayList<>(Arrays.asList(arr));
//		List<Integer> list1=new ArrayList<>();
//		Collections.addAll(list1,arr);
//		list1.add(50);
//		System.out.println(list1);
		
	}

}
