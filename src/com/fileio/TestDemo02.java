package com.fileio;

import java.io.File;
import java.io.IOException;

public class TestDemo02 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started");
		
		File f=new File("C:\\Users\\yash\\WORKSPACE\\corejavaworkspace\\students");
		boolean flag=f.mkdir();
		
		if(flag) {
			System.out.println("Folder created successfully");
		}else {
			System.out.println("Something went wrong");
		}
		File f1=new File(f,"student1.txt");
		f1.createNewFile();
		System.out.println(f1.canExecute());
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());
		System.out.println(f1.getCanonicalPath());
		System.out.println(f1.getFreeSpace());
		
		File f3=new File("C:\\Users\\yash\\WORKSPACE\\corejavaworkspace");
		String[]files=f3.list();
		for(String fname:files) {
			System.out.println(fname);
		}
		System.out.println("Total files= "+files.length);
		System.out.println("main method ended");
	}

}
