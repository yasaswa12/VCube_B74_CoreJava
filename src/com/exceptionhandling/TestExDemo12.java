package com.exceptionhandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestExDemo12 {

	public static void main(String[] args) throws IOException, InterruptedException {
		File f=new File("C:\\Users\\yash\\WORKSPACE\\corejavaworkspace\\files\\yash123.txt");
		FileReader fr=new FileReader(f);
		int i=fr.read();
		while(i != -1) {
			System.out.print((char)i);
			Thread.sleep(500);
			i=fr.read();
		}
	}

}
