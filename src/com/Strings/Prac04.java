package com.Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Prac04 {

	public static void main(String[] args) {
		String s="programming";
		
//		LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
//		for(char ch:s.toCharArray()) {
//			map.put(ch,map.getOrDefault(ch, 0)+1);
//		}
//		for(Map.Entry<Character,Integer>entry:map.entrySet()) {
//			if(entry.getValue()>1) {
//				System.out.println(entry.getKey()+"="+entry.getValue());
//			}
//		}
//		for(int i=0;i<s.length();i++) {
//			int count=0;
//			for(int j=i;j<s.length();j++) {
//				if(s.charAt(i)== s.charAt(j))
//					count++;
//			}
//			if(count>1) {
//				System.out.println(s.charAt(i)+" "+count);
//			}
//		}
		
		
		for(int i=0;i<s.length();i++) {
			boolean alreadyProcessed=false;
			for(int j=0;j<i;j++) {
				if(s.charAt(j)== s.charAt(i)) {
					alreadyProcessed=true;
					break;
				}		
			}
			if(alreadyProcessed)
				continue;
			int count=0;
			for(int j=0;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j))
					count++;
			}
			if(count>1)
				System.out.println(s.charAt(i)+"="+count);
		}
	}

}
