package com.Strings;

public class FirstNonRepeated {

	public static void main(String[] args) {
		String s="yasaswa";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(s.indexOf(ch) != s.lastIndexOf(ch)) {
				System.out.println(ch);
				break;
			}
		}
	}

}
