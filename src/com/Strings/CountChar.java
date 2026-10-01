package com.Strings;

public class CountChar {

	public static void main(String[] args) {
		String s="java";
		System.out.println("Length= "+s.length());
		int count=0;
		int vowels=0;
		int consonants=0;
		for(int i=0;i<s.length();i++) {
			count++;
			char ch=Character.toLowerCase(s.charAt(i));
			if(ch>='a' && ch<='z') {
			if(ch == 'a'|| ch=='e'||ch == 'i'||ch=='o'||ch=='u') {
				vowels++;
			}else {
				consonants++;
			}
			}
		}
		System.out.println("vowels "+vowels);
		System.out.println("consonants= "+consonants);
		System.out.println("length= "+count);
		
	}

}
