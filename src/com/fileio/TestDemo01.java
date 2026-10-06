package com.fileio;

import java.io.File;
import java.io.IOException;
public class TestDemo01 {

	public static void main(String[] args) {
		System.out.println("main method started");
		File f=new File("C:\\Users\\yash\\WORKSPACE\\corejavaworkspace\\files\\student.txt");
		try {
			System.out.println("in try");
			
			if(!f.exists()) {
				
			boolean flag=f.createNewFile();
			
			if(flag) 
				System.out.println("File created successfully !");
			else 
				System.out.println("Something went wrong");
			
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("main method ended");
	}

}
