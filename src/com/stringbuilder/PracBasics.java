 package com.stringbuilder;

public class PracBasics {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("java");
		sb.append(" full");
		sb.append(" stack");
		System.out.println(sb);
		sb.insert(15, " by vcube");
		System.out.println(sb);
		sb.delete(15,24);
		System.out.println(sb);
		sb.deleteCharAt(14);
		System.out.println(sb);
		System.out.println(sb.reverse());
	}
}
