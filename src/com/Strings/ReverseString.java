package com.Strings;

public class ReverseString {

	public static void main(String[] args) {
		String s="Java";
		String rev="";
		//Reverse
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(s+" "+rev);
		//using StringBilder
		String reverse=new StringBuilder(s).reverse().toString();
		System.out.println(reverse);
	}

}
