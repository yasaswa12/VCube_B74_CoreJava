package com.Strings;

public class ISPalindromeString {

	public static void main(String[] args) {
		String s="mada";//madam,level,racecar
		isPalindrome(s);
	}

	private static void isPalindrome(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		
		if(s.equals(rev)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}

}
