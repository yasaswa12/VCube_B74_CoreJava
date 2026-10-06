package com.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("main method started");
		
		File f=new File("C:\\Users\\yash\\WORKSPACE\\corejavaworkspace\\files\\sr.txt");
		FileInputStream fis=new FileInputStream(f);
		try (ObjectInputStream ois = new ObjectInputStream(fis)) {
			Emp obj=(Emp)ois.readObject();
			System.out.println(obj.toString());
		}
		System.out.println("main method ended");
	}

}
