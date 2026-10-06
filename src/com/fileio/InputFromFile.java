package com.fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputFromFile {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("main method started");
		File f=new File("C:\\Users\\yash\\WORKSPACE\\corejavaworkspace\\files\\text.txt");
		Scanner sc=new Scanner(f);
		
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
			
		}
		System.out.println("main method ended");
	}

}
