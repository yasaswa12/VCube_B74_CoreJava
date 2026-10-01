package com.Strings;

public class CountNumofWords {

	public static void main(String[] args) {
		String s="     Java is very simple   ";
		String [] words=s.trim().split("\\s+");
		for(String word:words) {
			System.out.print(word);
		}
		System.out.println();
		String s1="12345a";
		boolean result=true;
		for(int i=0;i<s1.length();i++) {
			if(! Character.isDigit(s1.charAt(i))) {
				result=false;
				break;
			}
		}
		System.out.println(result);
		String s2="alphabets";
		boolean res=true;
		for(int i=0;i<s2.length();i++) {
			if(! Character.isLetter(s2.charAt(i))) {
				res=false;
				break;
			}
		}
		System.out.println(res);
	}

}
