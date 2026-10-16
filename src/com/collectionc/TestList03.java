package com.collectionc;

import java.util.ArrayList;
import java.util.List;

public class TestList03 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("yaasaswa");
		list.add("sudheer");
		list.add("tulasi");
		 List<String> list1=new ArrayList<>();
		 list1=list.subList(0, 2);
		 list1.add("arava");
		 System.out.println(list);
		 System.out.println(list1);
	}

}
