package com.stringbuilder;

public class StringBufferBasics01 {

	public static void main(String[] args) {
		//mutable sychronized
//		StringBuffer sb=new StringBuffer();
//		sb.append("java");
//		System.out.println(sb);
//		String s=new String("java");
//		String s1=s.intern();
//		System.out.println(s==s1);
		String s1="java";
		String s2="ja"+"va";
		String s3=new String("java");
		String s4=s3.intern();
		String s5=new StringBuilder("java").toString();
		
		System.out.println(s1 == s2);//true
		System.out.println(s1 == s3);//false
		System.out.println( s1 == s4);//true
		System.out.println(s1==s5);//false
//		String s4="java";
//		String s5="full";
//		String s6="javafull";
//		String s7=s4+s5;
//		System.out.println(s6==s7);
	}

}
