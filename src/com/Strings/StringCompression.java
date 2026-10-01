package com.Strings;

public class StringCompression {

	public static void main(String[] args) {
		String s="aaabbcccc";
		String res="";
		int count=1;
		for(int i=0;i<s.length();i++) {
			if(i<s.length()-1 && s.charAt(i)==s.charAt(i+1))
				count++;
			else {
				res+=s.charAt(i);
				res+=count;
				count=1;
						
			}
		}
		System.out.println(res);
	}

}
