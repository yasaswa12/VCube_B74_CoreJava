package com.Strings;

public class CountOccurenceOfChar {

	public static void main(String[] args) {
		String s="Programming";
		char target='g';
		int count=0;
		for(char ch:s.toCharArray()) {
			if(ch==target) {
				count++;
			}
		}
		System.out.println(target+" "+count);
	}

}
