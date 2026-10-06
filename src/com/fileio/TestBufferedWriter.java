package com.fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferedWriter {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started");
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\yash\\WORKSPACE\\corejavaworkspace\\files\\sudheer.txt"))) {
			bw.write(65);
			bw.newLine();
			bw.write("String");
			bw.flush();
		}
	}

}
