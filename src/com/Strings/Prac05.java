package com.Strings;

import java.util.Arrays;

public class Prac05 {

	public static void main(String[] args) {
		
//		String s="java";
//		boolean[]visited=new boolean[s.length()];
//		for(int i=0;i<s.length();i++) {
//			if(visited[i])
//				continue;
//			int count=1;
//			for(int j=i+1;j<s.length();j++) {
//				if(s.charAt(i)==s.charAt(j)) {
//				count++;
//				visited[j]=true;
//				}
//			}
//			System.out.println(s.charAt(i)+"="+count);
//			
//		}
		
		String[]names= {"yasaswa","Sudheer","yasaswa"};
		String[]result=new String[names.length];
		
		for(int i=0;i<names.length;i++) {
			boolean duplicate=false;
			for(int j=0;j<i;j++) {
				if(names[i].equals(names[j])) {
					duplicate=true;
					break;
				}
			}
			if(duplicate)
				continue;
			result[i]=names[i];
		}
		for(String r:result) {
			System.out.println(r);
		}
	
	}
	

}
