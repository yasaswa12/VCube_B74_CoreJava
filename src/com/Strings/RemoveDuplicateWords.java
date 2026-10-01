package com.Strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String s="Java is simple and java is simple";
		String[]words=s.split("\\s+");
		Set<String>set=new LinkedHashSet<>();
		for(String word:words) {
			set.add(word);
		}
		System.out.println(set);
	}

}
