package com.Strings;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		String s="listen";
		String s1="silent";
//		char[]a=s.toCharArray();
//		char[]b=s1.toCharArray();
//		Arrays.sort(a);
//		Arrays.sort(b);
//		if(Arrays.equals(a, b)){
//			System.out.println("Anagram");
//		}else {
//			System.out.println("Not anagram");
//		}
		if(s.length()!=s1.length()) {
			System.out.println("Not anagram");
			return;
			}
		int []freq=new int[256];
		for(int i=0;i<s.length();i++) {
			freq[s.charAt(i)]++;
			freq[s1.charAt(i)]--;
		}
		boolean anagram=true;
		for(int i=0;i<256;i++) {
			if(freq[i]!= 0) {
				anagram=false;
				break;
			}
		}
		System.out.println(anagram ? "Anagram" :"Not anagram");
				
	}

}
