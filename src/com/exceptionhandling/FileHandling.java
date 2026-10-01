package com.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=null;
		FileInputStream fis=null;
		try {
		 fos=new FileOutputStream("C:\\Users\\yash\\WORKSPACE\\corejavaworkspace\\files\student.txt");
		String data="Name: Yasaswa Ambati\n Course:Java";
		fos.write(data.getBytes());
//		fos.close();
		System.out.println("Data written successfully");
		//Reading 
		fis=new FileInputStream("C:\\Users\\yash\\WORKSPACE\\corejavaworkspace\\files\student.txt");
		int ch;
		System.out.println("File contents");
		while((ch=fis.read())!= -1) {
			System.out.print((char)ch);
		}
		
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			fos.close();
			fis.close();
		}
	}

}
