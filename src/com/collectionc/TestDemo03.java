package com.collectionc;

import java.util.ArrayList;
import java.util.Collection;
public class TestDemo03 {

	public static void main(String[] args) {
		Collection<Integer> c1=new ArrayList<>();
		c1.add(10);
		c1.add(20);
		c1.add(30);
		c1.add(40);
		c1.add(50);
		c1.add(60);
		int largest=0;
		int secLargest=0;
		for(Integer i:c1) {
			if(i>largest) {
				secLargest=largest;
				largest=i;
				
			}else if(i > secLargest & i < largest) {
				secLargest=i;
			}
		}
		System.out.println(largest);
		System.out.println(secLargest);
	}

}
