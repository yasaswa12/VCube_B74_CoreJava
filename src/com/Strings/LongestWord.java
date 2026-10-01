package com.Strings;

public class LongestWord {

	public static void main(String[] args) {
		String s="Java Programming Language";
		String[] words=s.split(" ");
		String longest="";
		String shortest=words[0];
		for(String word:words) {
			if(word.length()>longest.length()) {
				longest=word;
			}
			if(word.length()<shortest.length()) {
				shortest=word;
			}
		}
		System.out.println("Longest Word = "+longest);
		System.out.println("Shortest Word = "+shortest);
		System.out.println("words count="+words.length);
		
	}

}
