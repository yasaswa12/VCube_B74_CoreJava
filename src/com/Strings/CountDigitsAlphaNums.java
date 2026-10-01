package com.Strings;

public class CountDigitsAlphaNums {

	public static void main(String[] args) {
		String s="Java123@#456";
		int alpha=0;
		int num=0;
		int sChars=0;
		for(int i=0;i<s.length();i++) {
			if(Character.isLetter(s.charAt(i))) {
				alpha++;
			}else if(Character.isDigit(s.charAt(i))) {
				num++;
			}else {
				sChars++;
			}
		}
		System.out.println("Alphabets= "+alpha);
		System.out.println("Numbers= "+num);
		System.out.println("Special Characters= "+sChars);
	}

}
