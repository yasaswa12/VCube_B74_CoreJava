package com.Strings;

public class CheckPanagram {

	public static void main(String[] args) {
		String s="The quick brown fox jumps over the lazy dog".toLowerCase();
		boolean anagram=true;
		for(char ch='a';ch<='z';ch++) {
			if(s.indexOf(ch)== -1) {
				anagram=false;
				break;
			}
		}
		System.out.println(anagram ? "Anagram" : "Not Anagram");
	}

}
