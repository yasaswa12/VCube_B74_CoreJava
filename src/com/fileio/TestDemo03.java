package com.fileio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestDemo03 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started");
		//Writer-only characters and char array
		
		try (FileWriter fw = new FileWriter("C:\\Users\\yash\\WORKSPACE\\corejavaworkspace\\files\\yasaswa.txt",true)) {
			fw.write("sudheer");
		}
		try (FileReader fr = new FileReader("C:\\Users\\yash\\WORKSPACE\\corejavaworkspace\\files\\yasaswa.txt")) {
			int i=fr.read();
			while(i !=-1) {
				System.out.print((char)i);
				i=fr.read();
			}
		}
	}

}
