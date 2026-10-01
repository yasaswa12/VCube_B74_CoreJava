package com.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StudentFile {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started");
		File f=new File("C:\\Users\\yash\\WORKSPACE\\corejavaworkspace\\files\\student.txt");
		
		Object arr[]= {1,"string",10.0,'c'};
		try{
			boolean f1=f.createNewFile();
			if(f1) {
				System.out.println("created sucessfully");
			}else {
				System.out.println("file not created");
			}
		}catch(IOException i) {
			System.out.println("in catch io exception");
		}
		
		FileReader fr=new FileReader(f);
		int i=fr.read();
		while(i !=-1) {
			System.out.print((char)i);
			i=fr.read();
		}
	}

}
