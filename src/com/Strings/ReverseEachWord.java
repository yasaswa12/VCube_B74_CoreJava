package com.Strings;

public class ReverseEachWord {

	public static void main(String[] args) {
		String s="Java is Simple";
		String[] words=s.split(" ");
		
		for(int i=0;i<words.length;i++) {
			System.out.print(words[i]+" ");
		}
		
//		for(int i=0;i<words.length;i++) {
//			String rev="";
//			for(int j=words[i].length()-1;j>=0;j--) {
//				rev+=words[i].charAt(j);
//			}
//			words[i]=rev;
//		}
		System.out.println();
		for(String word:words) {
			String rev="";
			for(int i=word.length()-1;i>=0;i--)
				rev+=word.charAt(i);
			System.out.println(rev);
		}
		
//		for(int i=0;i<words.length;i++) {
//			System.out.print(words[i]+" ");
//		}
	}

}
