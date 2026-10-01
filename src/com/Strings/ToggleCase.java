package com.Strings;

public class ToggleCase {

	public static void main(String[] args) {
		String s="JavA";
		String res="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isLowerCase(ch)) {
				res+=Character.toUpperCase(ch);
			}else {
				res+=Character.toLowerCase(ch);
			}
		}
		System.out.println(res);
	}

}
