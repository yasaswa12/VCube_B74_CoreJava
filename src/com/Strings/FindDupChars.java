package com.Strings;

public class FindDupChars {

	public static void main(String[] args) {
		String s="yasaswa";
		int []freq=new int[256];
		for(int i=0;i<s.length();i++) {
			freq[s.charAt(i)]++;
		}
		for(int i=97;i<124;i++) {
			if(freq[i]>1) {
				System.out.println((char)i+" "+freq[i]);
			}
		}
	}

}
