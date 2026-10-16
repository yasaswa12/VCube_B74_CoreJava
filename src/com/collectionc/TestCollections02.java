package com.collectionc;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollections02 {

	public static void main(String[] args) {
		Collection<String> fruits=new ArrayList<>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Grapes");
		fruits.add("Pineapple");
		fruits.add("Watermelon");
		fruits.add("Papaya");
		fruits.add("Guava");
		fruits.add("Pomegranate");
		
		Collection<String> vegetables=new ArrayList<>();
		vegetables.add("Banana");
		vegetables.add("Potato");
		vegetables.add("Tomato");
		vegetables.add("Carrot");
		vegetables.add("Onion");
		vegetables.add("Cabbage");
		
		//fruits.removeAll(vegetables);
		System.out.println(fruits);
		System.out.println(fruits.contains("Apple"));
		fruits.retainAll(vegetables);
		System.out.println(fruits);
	}

}
