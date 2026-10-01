package com.exceptionhandling;

import java.io.File;
import java.io.IOException;

public class TestExDemo11 {

	public static void main(String[] args) {
		System.out.println("main method started");
		File f=new File("C:\\Users\\yash\\WORKSPACE\\corejavaworkspace\\files\\yash1234.txt");
		try {
			boolean st=f.createNewFile();
			if(st) {
				System.out.println("File created");
			}else {
				System.out.println("file not created");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			System.out.println("file operation completed");
		}
	}

}
