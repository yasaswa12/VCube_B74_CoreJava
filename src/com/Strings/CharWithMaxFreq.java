package com.Strings;

public class CharWithMaxFreq {

	public static void main(String[] args) {
		String s="yasaswa";
		int[]freq=new int[256];
		for(char ch:s.toCharArray()) {
			freq[ch]++;
		}
		int max=0;
		char str =s.charAt(0);
		for(char ch:s.toCharArray()) {
			if(freq[ch]>max) {
				max=freq[ch];
				str=ch;
			}
		}
		System.out.println(str+" "+max);
	}

}
