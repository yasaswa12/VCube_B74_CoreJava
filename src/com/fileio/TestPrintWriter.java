package com.fileio;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class TestPrintWriter {

	public static void main(String[] args) throws FileNotFoundException  {
		System.out.println("main method");
		try (PrintWriter pw = new PrintWriter("C:\\Users\\yash\\WORKSPACE\\corejavaworkspace\\files\\cricketer.txt")) {
			pw.println(123);
			pw.println("yasaswa");
		}
		System.out.println("main ethod ended");
	}

}
