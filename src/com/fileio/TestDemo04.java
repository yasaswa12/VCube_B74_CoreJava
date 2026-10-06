package com.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestDemo04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\yash\\WORKSPACE\\corejavaworkspace\\files\\yasaswa.txt"));
		String s=br.readLine();
		while(s!=null) {
			System.out.println(s);
			s=br.readLine();
		}
	}

}
